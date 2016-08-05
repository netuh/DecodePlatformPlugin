package br.ufpe.ines.decode.decode;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

public class FileAdapterFactoryContentProvider extends AdapterFactoryContentProvider{

	public FileAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
    protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource)
    {
      return 
        new PropertySource(object, itemPropertySource)
        {
          @Override
          protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor)
          {
            return 
              new PropertyDescriptor(object, itemPropertyDescriptor)
              {
                @Override
                public CellEditor createPropertyEditor(Composite composite)
                {
                  Object feature = itemPropertyDescriptor.getFeature(this.object);
                  if (feature instanceof EAttribute){
                	EAttribute att = (EAttribute)feature;
                	if (att.getName().equals("localFilePath")){
                		return new FilePropertyEditor(composite);
                	}
                  }
                  return super.createPropertyEditor(composite);
                }
              };
          }
        };
    }

}
