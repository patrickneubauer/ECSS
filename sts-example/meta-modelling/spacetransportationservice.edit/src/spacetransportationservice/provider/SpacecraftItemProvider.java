/**
 */
package spacetransportationservice.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spacetransportationservice.Spacecraft;
import spacetransportationservice.SpacetransportationserviceFactory;
import spacetransportationservice.SpacetransportationservicePackage;

/**
 * This is the item provider adapter for a {@link spacetransportationservice.Spacecraft} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacecraftItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftItemProvider(AdapterFactory adapterFactory) {
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

			addLaunchSitesPropertyDescriptor(object);
			addFunctionsPropertyDescriptor(object);
			addManufacturerPropertyDescriptor(object);
			addCountryOfOriginPropertyDescriptor(object);
			addRelaunchCostInMioUSDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Launch Sites feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaunchSitesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Spacecraft_launchSites_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Spacecraft_launchSites_feature", "_UI_Spacecraft_type"),
				 SpacetransportationservicePackage.Literals.SPACECRAFT__LAUNCH_SITES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Spacecraft_functions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Spacecraft_functions_feature", "_UI_Spacecraft_type"),
				 SpacetransportationservicePackage.Literals.SPACECRAFT__FUNCTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manufacturer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufacturerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Spacecraft_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Spacecraft_manufacturer_feature", "_UI_Spacecraft_type"),
				 SpacetransportationservicePackage.Literals.SPACECRAFT__MANUFACTURER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Country Of Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryOfOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Spacecraft_countryOfOrigin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Spacecraft_countryOfOrigin_feature", "_UI_Spacecraft_type"),
				 SpacetransportationservicePackage.Literals.SPACECRAFT__COUNTRY_OF_ORIGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relaunch Cost In Mio USD feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelaunchCostInMioUSDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Spacecraft_relaunchCostInMioUSD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Spacecraft_relaunchCostInMioUSD_feature", "_UI_Spacecraft_type"),
				 SpacetransportationservicePackage.Literals.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SpacetransportationservicePackage.Literals.SPACECRAFT__STAGES);
			childrenFeatures.add(SpacetransportationservicePackage.Literals.SPACECRAFT__PHYSICAL_PROPERTIES);
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
	 * This returns Spacecraft.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Spacecraft"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Spacecraft)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Spacecraft_type") :
			getString("_UI_Spacecraft_type") + " " + label;
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

		switch (notification.getFeatureID(Spacecraft.class)) {
			case SpacetransportationservicePackage.SPACECRAFT__FUNCTIONS:
			case SpacetransportationservicePackage.SPACECRAFT__MANUFACTURER:
			case SpacetransportationservicePackage.SPACECRAFT__COUNTRY_OF_ORIGIN:
			case SpacetransportationservicePackage.SPACECRAFT__RELAUNCH_COST_IN_MIO_USD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpacetransportationservicePackage.SPACECRAFT__STAGES:
			case SpacetransportationservicePackage.SPACECRAFT__PHYSICAL_PROPERTIES:
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
				(SpacetransportationservicePackage.Literals.SPACECRAFT__STAGES,
				 SpacetransportationserviceFactory.eINSTANCE.createStage()));

		newChildDescriptors.add
			(createChildParameter
				(SpacetransportationservicePackage.Literals.SPACECRAFT__PHYSICAL_PROPERTIES,
				 SpacetransportationserviceFactory.eINSTANCE.createPhysicalProperty()));
	}

}
