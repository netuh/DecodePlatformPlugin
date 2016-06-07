package br.ufpe.ines.decode.plugin.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class FileUtil {

	public static File loadResource(String entryyPath) {
		Bundle bundle = Platform.getBundle("br.ufpe.ines.decode.plugin");
		URL fileURL = bundle.getEntry(entryyPath);
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
		return  file;
	}
	
	public static void addFilesToZip(File source, File destination) throws IOException, ArchiveException {
        OutputStream archiveStream = new FileOutputStream(destination);
        ArchiveOutputStream archive = new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, archiveStream);

        Collection<File> fileList = FileUtils.listFiles(source, null, true);

        for (File file : fileList) {
            String entryName = getEntryName(source, file);
            ZipArchiveEntry entry = new ZipArchiveEntry(entryName);
            archive.putArchiveEntry(entry);

            BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));

            IOUtils.copy(input, archive);
            input.close();
            archive.closeArchiveEntry();
        }

        archive.finish();
        archiveStream.close();
    }

    /**
     * Remove the leading part of each entry that contains the source directory name
     *
     * @param source the directory where the file entry is found
     * @param file   the file that is about to be added
     * @return the name of an archive entry
     * @throws IOException if the io fails
     */
    private static String getEntryName(File source, File file) throws IOException {
        int index = source.getAbsolutePath().length() + 1;
        String path = file.getCanonicalPath();

        return path.substring(index);
    }

	public static Path extractZip(File zipFile) throws ArchiveException, IOException {
		final InputStream is = new FileInputStream(zipFile);
	    ArchiveInputStream ais = new
	            ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP,
	            is);
	    Path tempDir = Files.createTempDirectory("tempfiles");

	    ZipArchiveEntry entry = (ZipArchiveEntry) ais.getNextEntry();
	    while (entry != null) {
	        File outputFile = new File(tempDir.toFile(), entry.getName());
	        System.out.println("outputFile="+outputFile.getAbsolutePath());
	        outputFile.createNewFile();
	        OutputStream os = new FileOutputStream(outputFile);

	        IOUtils.copy(ais, os);
	        os.close();

	        entry = (ZipArchiveEntry) ais.getNextEntry();
	    }

	    ais.close();
	    is.close();
	    return tempDir;
	}
}
