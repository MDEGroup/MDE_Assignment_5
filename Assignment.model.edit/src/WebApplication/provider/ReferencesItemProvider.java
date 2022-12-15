/**
 */
package WebApplication.provider;


import WebApplication.References;
import WebApplication.WebApplicationFactory;
import WebApplication.WebApplicationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WebApplication.References} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesItemProvider extends FeaturesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns References.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/References"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((References)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_References_type") :
			getString("_UI_References_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(References.class)) {
			case WebApplicationPackage.REFERENCES__FOREIGN_KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY,
				 WebApplicationFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY,
				 WebApplicationFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY,
				 WebApplicationFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY,
				 WebApplicationFactory.eINSTANCE.createReferences()));

		newChildDescriptors.add
			(createChildParameter
				(WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY,
				 WebApplicationFactory.eINSTANCE.createAttributes()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebApplicationPackage.Literals.SYSTEM__CONTENT ||
			childFeature == WebApplicationPackage.Literals.CONTENT__DYNAMIC_CONTENT ||
			childFeature == WebApplicationPackage.Literals.DYNAMIC_CONTENT__ENTITY ||
			childFeature == WebApplicationPackage.Literals.REFERENCES__FOREIGN_KEY ||
			childFeature == WebApplicationPackage.Literals.ENTITY__FEATURES ||
			childFeature == WebApplicationPackage.Literals.ENTITY__RELATION_R ||
			childFeature == WebApplicationPackage.Literals.ENTITY__REFERENCES ||
			childFeature == WebApplicationPackage.Literals.FEATURES__REFERENCE ||
			childFeature == WebApplicationPackage.Literals.DYNAMIC_CONTENT__ATTRIBUTES_D ||
			childFeature == WebApplicationPackage.Literals.FEATURES__ATTRIBUTES_F;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
