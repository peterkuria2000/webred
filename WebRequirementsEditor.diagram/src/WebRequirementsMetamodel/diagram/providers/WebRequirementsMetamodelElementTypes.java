package WebRequirementsMetamodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class WebRequirementsMetamodelElementTypes {

	/**
	 * @generated
	 */
	private WebRequirementsMetamodelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SD_1000 = getElementType("WebRequirementsEditor.diagram.SD_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Content_2001 = getElementType("WebRequirementsEditor.diagram.Content_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Navigational_2002 = getElementType("WebRequirementsEditor.diagram.Navigational_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Personalization_2003 = getElementType("WebRequirementsEditor.diagram.Personalization_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2004 = getElementType("WebRequirementsEditor.diagram.Goal_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2005 = getElementType("WebRequirementsEditor.diagram.Softgoal_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Service_2006 = getElementType("WebRequirementsEditor.diagram.Service_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2007 = getElementType("WebRequirementsEditor.diagram.Actor_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Layout_2008 = getElementType("WebRequirementsEditor.diagram.Layout_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SR_3001 = getElementType("WebRequirementsEditor.diagram.SR_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Service_3002 = getElementType("WebRequirementsEditor.diagram.Service_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Personalization_3003 = getElementType("WebRequirementsEditor.diagram.Personalization_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Navigational_3004 = getElementType("WebRequirementsEditor.diagram.Navigational_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Layout_3005 = getElementType("WebRequirementsEditor.diagram.Layout_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Content_3006 = getElementType("WebRequirementsEditor.diagram.Content_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Goal_3007 = getElementType("WebRequirementsEditor.diagram.Goal_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Softgoal_3008 = getElementType("WebRequirementsEditor.diagram.Softgoal_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IDependency_4004 = getElementType("WebRequirementsEditor.diagram.IDependency_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Decomposition_4001 = getElementType("WebRequirementsEditor.diagram.Decomposition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MeansEnd_4002 = getElementType("WebRequirementsEditor.diagram.MeansEnd_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Contribution_4003 = getElementType("WebRequirementsEditor.diagram.Contribution_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(
					SD_1000,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getSD());

			elements.put(
					Content_2001,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getContent());

			elements.put(
					Navigational_2002,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getNavigational());

			elements.put(
					Personalization_2003,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getPersonalization());

			elements.put(
					Goal_2004,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getGoal());

			elements.put(
					Softgoal_2005,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(
					Service_2006,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getService());

			elements.put(
					Actor_2007,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getActor());

			elements.put(
					Layout_2008,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getLayout());

			elements.put(
					SR_3001,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getSR());

			elements.put(
					Service_3002,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getService());

			elements.put(
					Personalization_3003,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getPersonalization());

			elements.put(
					Navigational_3004,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getNavigational());

			elements.put(
					Layout_3005,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getLayout());

			elements.put(
					Content_3006,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getContent());

			elements.put(
					Goal_3007,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getGoal());

			elements.put(
					Softgoal_3008,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(
					IDependency_4004,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getIDependency());

			elements.put(
					Decomposition_4001,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getDecomposition());

			elements.put(
					MeansEnd_4002,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getMeansEnd());

			elements.put(
					Contribution_4003,
					WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
							.getContribution());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(SD_1000);
			KNOWN_ELEMENT_TYPES.add(Content_2001);
			KNOWN_ELEMENT_TYPES.add(Navigational_2002);
			KNOWN_ELEMENT_TYPES.add(Personalization_2003);
			KNOWN_ELEMENT_TYPES.add(Goal_2004);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2005);
			KNOWN_ELEMENT_TYPES.add(Service_2006);
			KNOWN_ELEMENT_TYPES.add(Actor_2007);
			KNOWN_ELEMENT_TYPES.add(Layout_2008);
			KNOWN_ELEMENT_TYPES.add(SR_3001);
			KNOWN_ELEMENT_TYPES.add(Service_3002);
			KNOWN_ELEMENT_TYPES.add(Personalization_3003);
			KNOWN_ELEMENT_TYPES.add(Navigational_3004);
			KNOWN_ELEMENT_TYPES.add(Layout_3005);
			KNOWN_ELEMENT_TYPES.add(Content_3006);
			KNOWN_ELEMENT_TYPES.add(Goal_3007);
			KNOWN_ELEMENT_TYPES.add(Softgoal_3008);
			KNOWN_ELEMENT_TYPES.add(IDependency_4004);
			KNOWN_ELEMENT_TYPES.add(Decomposition_4001);
			KNOWN_ELEMENT_TYPES.add(MeansEnd_4002);
			KNOWN_ELEMENT_TYPES.add(Contribution_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			return SD_1000;
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			return Content_2001;
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			return Navigational_2002;
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			return Personalization_2003;
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return Goal_2004;
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return Softgoal_2005;
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			return Service_2006;
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_2007;
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			return Layout_2008;
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return SR_3001;
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			return Service_3002;
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			return Personalization_3003;
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			return Navigational_3004;
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			return Layout_3005;
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			return Content_3006;
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return Goal_3007;
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return Softgoal_3008;
		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
			return IDependency_4004;
		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
			return Decomposition_4001;
		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
			return MeansEnd_4002;
		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return Contribution_4003;
		}
		return null;
	}

}
