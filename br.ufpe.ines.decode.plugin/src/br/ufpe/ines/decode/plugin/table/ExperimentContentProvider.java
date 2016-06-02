package br.ufpe.ines.decode.plugin.table;

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ExperimentContentProvider  implements IStructuredContentProvider {

	@Override
	public void dispose() {
		 //Empty
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		//Empty
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection) {
			return ((Collection<?>) inputElement).toArray();
		}
		return new Object[0];
	}

}
