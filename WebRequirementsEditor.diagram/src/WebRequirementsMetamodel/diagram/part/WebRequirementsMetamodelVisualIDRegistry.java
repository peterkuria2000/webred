package WebRequirementsMetamodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WebRequirementsMetamodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "WebRequirementsEditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
					.equals(view.getType())) {
				return WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
				.getSD().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((WebRequirementsMetamodel.SD) domainElement)) {
			return WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getModelID(containerView);
		if (!WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getContent().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getNavigational().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getPersonalization().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getService().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getActor().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getLayout().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getSR().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getService().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getPersonalization().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getNavigational().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getLayout().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getContent().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID;
			}
			if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())) {
				return WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getModelID(containerView);
		if (!WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.ContentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.NavigationalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.PersonalizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.GoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.ServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.ActorDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.LayoutNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.ServiceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.PersonalizationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.NavigationalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.ContentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.GoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			if (WebRequirementsMetamodel.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
				.getIDependency().isSuperTypeOf(domainElement.eClass())) {
			return WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID;
		}
		if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
				.getDecomposition().isSuperTypeOf(domainElement.eClass())) {
			return WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID;
		}
		if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
				.getMeansEnd().isSuperTypeOf(domainElement.eClass())) {
			return WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID;
		}
		if (WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
				.getContribution().isSuperTypeOf(domainElement.eClass())) {
			return WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(WebRequirementsMetamodel.SD element) {
		return true;
	}

}
