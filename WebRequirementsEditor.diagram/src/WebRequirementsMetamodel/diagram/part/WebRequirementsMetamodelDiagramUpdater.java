package WebRequirementsMetamodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WebRequirementsMetamodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			return getSD_1000SemanticChildren(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2007SemanticChildren(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return getSR_3001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> getSD_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebRequirementsMetamodel.SD modelElement = (WebRequirementsMetamodel.SD) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStrategicDependencies()
				.iterator(); it.hasNext();) {
			WebRequirementsMetamodel.Argumentable childElement = (WebRequirementsMetamodel.Argumentable) it
					.next();
			int visualID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActors().iterator(); it.hasNext();) {
			WebRequirementsMetamodel.Actor childElement = (WebRequirementsMetamodel.Actor) it
					.next();
			int visualID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> getActor_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebRequirementsMetamodel.Actor modelElement = (WebRequirementsMetamodel.Actor) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStrategicRelationships()
				.iterator(); it.hasNext();) {
			WebRequirementsMetamodel.SR childElement = (WebRequirementsMetamodel.SR) it
					.next();
			int visualID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> getSR_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebRequirementsMetamodel.SR modelElement = (WebRequirementsMetamodel.SR) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIElement().iterator(); it
				.hasNext();) {
			WebRequirementsMetamodel.IntentionalElement childElement = (WebRequirementsMetamodel.IntentionalElement) it
					.next();
			int visualID = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID) {
				result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContainedLinks(
			View view) {
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			return getSD_1000ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			return getContent_2001ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			return getNavigational_2002ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			return getPersonalization_2003ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2004ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2005ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			return getService_2006ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2007ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			return getLayout_2008ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return getSR_3001ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			return getService_3002ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			return getPersonalization_3003ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			return getNavigational_3004ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			return getLayout_3005ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			return getContent_3006ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_3007ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3008ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
			return getIDependency_4004ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
			return getDecomposition_4001ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4002ContainedLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			return getContent_2001IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			return getNavigational_2002IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			return getPersonalization_2003IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2004IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2005IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			return getService_2006IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2007IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			return getLayout_2008IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return getSR_3001IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			return getService_3002IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			return getPersonalization_3003IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			return getNavigational_3004IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			return getLayout_3005IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			return getContent_3006IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_3007IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3008IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
			return getIDependency_4004IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
			return getDecomposition_4001IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4002IncomingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			return getContent_2001OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			return getNavigational_2002OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			return getPersonalization_2003OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2004OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2005OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			return getService_2006OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2007OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			return getLayout_2008OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return getSR_3001OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			return getService_3002OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			return getPersonalization_3003OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			return getNavigational_3004OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			return getLayout_3005OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			return getContent_3006OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_3007OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3008OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
			return getIDependency_4004OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
			return getDecomposition_4001OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4002OutgoingLinks(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSD_1000ContainedLinks(
			View view) {
		WebRequirementsMetamodel.SD modelElement = (WebRequirementsMetamodel.SD) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IDependency_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContent_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getNavigational_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getPersonalization_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getGoal_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSoftgoal_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getService_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getActor_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getLayout_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSR_3001ContainedLinks(
			View view) {
		WebRequirementsMetamodel.SR modelElement = (WebRequirementsMetamodel.SR) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getService_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getPersonalization_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getNavigational_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getLayout_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContent_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getGoal_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSoftgoal_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIDependency_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getDecomposition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getMeansEnd_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContribution_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContent_2001IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Content modelElement = (WebRequirementsMetamodel.Content) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getNavigational_2002IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Navigational modelElement = (WebRequirementsMetamodel.Navigational) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getPersonalization_2003IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Personalization modelElement = (WebRequirementsMetamodel.Personalization) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getGoal_2004IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Goal modelElement = (WebRequirementsMetamodel.Goal) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSoftgoal_2005IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Softgoal modelElement = (WebRequirementsMetamodel.Softgoal) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getService_2006IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Service modelElement = (WebRequirementsMetamodel.Service) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getActor_2007IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Actor modelElement = (WebRequirementsMetamodel.Actor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getLayout_2008IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Layout modelElement = (WebRequirementsMetamodel.Layout) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSR_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getService_3002IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Service modelElement = (WebRequirementsMetamodel.Service) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getPersonalization_3003IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Personalization modelElement = (WebRequirementsMetamodel.Personalization) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getNavigational_3004IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Navigational modelElement = (WebRequirementsMetamodel.Navigational) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getLayout_3005IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Layout modelElement = (WebRequirementsMetamodel.Layout) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContent_3006IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Content modelElement = (WebRequirementsMetamodel.Content) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getGoal_3007IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Goal modelElement = (WebRequirementsMetamodel.Goal) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSoftgoal_3008IncomingLinks(
			View view) {
		WebRequirementsMetamodel.Softgoal modelElement = (WebRequirementsMetamodel.Softgoal) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IDependency_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Decomposition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIDependency_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getDecomposition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getMeansEnd_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContribution_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContent_2001OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Content modelElement = (WebRequirementsMetamodel.Content) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getNavigational_2002OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Navigational modelElement = (WebRequirementsMetamodel.Navigational) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getPersonalization_2003OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Personalization modelElement = (WebRequirementsMetamodel.Personalization) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getGoal_2004OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Goal modelElement = (WebRequirementsMetamodel.Goal) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSoftgoal_2005OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Softgoal modelElement = (WebRequirementsMetamodel.Softgoal) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getService_2006OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Service modelElement = (WebRequirementsMetamodel.Service) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getActor_2007OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Actor modelElement = (WebRequirementsMetamodel.Actor) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getLayout_2008OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Layout modelElement = (WebRequirementsMetamodel.Layout) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSR_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getService_3002OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Service modelElement = (WebRequirementsMetamodel.Service) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getPersonalization_3003OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Personalization modelElement = (WebRequirementsMetamodel.Personalization) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getNavigational_3004OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Navigational modelElement = (WebRequirementsMetamodel.Navigational) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getLayout_3005OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Layout modelElement = (WebRequirementsMetamodel.Layout) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContent_3006OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Content modelElement = (WebRequirementsMetamodel.Content) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getGoal_3007OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Goal modelElement = (WebRequirementsMetamodel.Goal) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getSoftgoal_3008OutgoingLinks(
			View view) {
		WebRequirementsMetamodel.Softgoal modelElement = (WebRequirementsMetamodel.Softgoal) view
				.getElement();
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IDependency_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Decomposition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Contribution_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIDependency_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getDecomposition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getMeansEnd_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContribution_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContainedTypeModelFacetLinks_IDependency_4004(
			WebRequirementsMetamodel.SD container) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.IDependency) {
				continue;
			}
			WebRequirementsMetamodel.IDependency link = (WebRequirementsMetamodel.IDependency) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getDependencyTo();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof WebRequirementsMetamodel.Dependable) {
				continue;
			}
			WebRequirementsMetamodel.Dependable dst = (WebRequirementsMetamodel.Dependable) theTarget;
			List sources = link.getDependencyFrom();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof WebRequirementsMetamodel.Dependable) {
				continue;
			}
			WebRequirementsMetamodel.Dependable src = (WebRequirementsMetamodel.Dependable) theSource;
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004,
					WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContainedTypeModelFacetLinks_Decomposition_4001(
			WebRequirementsMetamodel.SR container) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.Decomposition) {
				continue;
			}
			WebRequirementsMetamodel.Decomposition link = (WebRequirementsMetamodel.Decomposition) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement dst = link
					.getSubElement();
			WebRequirementsMetamodel.IntentionalElement src = link.getElement();
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001,
					WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContainedTypeModelFacetLinks_MeansEnd_4002(
			WebRequirementsMetamodel.SR container) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.MeansEnd) {
				continue;
			}
			WebRequirementsMetamodel.MeansEnd link = (WebRequirementsMetamodel.MeansEnd) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement dst = link.getEnds();
			WebRequirementsMetamodel.IntentionalElement src = link.getMeans();
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002,
					WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getContainedTypeModelFacetLinks_Contribution_4003(
			WebRequirementsMetamodel.SR container) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.Contribution) {
				continue;
			}
			WebRequirementsMetamodel.Contribution link = (WebRequirementsMetamodel.Contribution) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement dst = link
					.getContributed();
			WebRequirementsMetamodel.IntentionalElement src = link
					.getContributor();
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003,
					WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_IDependency_4004(
			WebRequirementsMetamodel.Dependable target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getIDependency_DependencyTo()
					|| false == setting.getEObject() instanceof WebRequirementsMetamodel.IDependency) {
				continue;
			}
			WebRequirementsMetamodel.IDependency link = (WebRequirementsMetamodel.IDependency) setting
					.getEObject();
			if (WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getDependencyFrom();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof WebRequirementsMetamodel.Dependable) {
				continue;
			}
			WebRequirementsMetamodel.Dependable src = (WebRequirementsMetamodel.Dependable) theSource;
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					target,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004,
					WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_Decomposition_4001(
			WebRequirementsMetamodel.IntentionalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getDecomposition_SubElement()
					|| false == setting.getEObject() instanceof WebRequirementsMetamodel.Decomposition) {
				continue;
			}
			WebRequirementsMetamodel.Decomposition link = (WebRequirementsMetamodel.Decomposition) setting
					.getEObject();
			if (WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement src = link.getElement();
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					target,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001,
					WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_MeansEnd_4002(
			WebRequirementsMetamodel.IntentionalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getMeansEnd_Ends()
					|| false == setting.getEObject() instanceof WebRequirementsMetamodel.MeansEnd) {
				continue;
			}
			WebRequirementsMetamodel.MeansEnd link = (WebRequirementsMetamodel.MeansEnd) setting
					.getEObject();
			if (WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement src = link.getMeans();
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					target,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002,
					WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getIncomingTypeModelFacetLinks_Contribution_4003(
			WebRequirementsMetamodel.IntentionalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebRequirementsMetamodel.WebRequirementsMetamodelPackage.eINSTANCE
					.getContribution_Contributed()
					|| false == setting.getEObject() instanceof WebRequirementsMetamodel.Contribution) {
				continue;
			}
			WebRequirementsMetamodel.Contribution link = (WebRequirementsMetamodel.Contribution) setting
					.getEObject();
			if (WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement src = link
					.getContributor();
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					target,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003,
					WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_IDependency_4004(
			WebRequirementsMetamodel.Dependable source) {
		WebRequirementsMetamodel.SD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebRequirementsMetamodel.SD) {
				container = (WebRequirementsMetamodel.SD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.IDependency) {
				continue;
			}
			WebRequirementsMetamodel.IDependency link = (WebRequirementsMetamodel.IDependency) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getDependencyTo();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof WebRequirementsMetamodel.Dependable) {
				continue;
			}
			WebRequirementsMetamodel.Dependable dst = (WebRequirementsMetamodel.Dependable) theTarget;
			List sources = link.getDependencyFrom();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof WebRequirementsMetamodel.Dependable) {
				continue;
			}
			WebRequirementsMetamodel.Dependable src = (WebRequirementsMetamodel.Dependable) theSource;
			if (src != source) {
				continue;
			}
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004,
					WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Decomposition_4001(
			WebRequirementsMetamodel.IntentionalElement source) {
		WebRequirementsMetamodel.SR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebRequirementsMetamodel.SR) {
				container = (WebRequirementsMetamodel.SR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.Decomposition) {
				continue;
			}
			WebRequirementsMetamodel.Decomposition link = (WebRequirementsMetamodel.Decomposition) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement dst = link
					.getSubElement();
			WebRequirementsMetamodel.IntentionalElement src = link.getElement();
			if (src != source) {
				continue;
			}
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001,
					WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_MeansEnd_4002(
			WebRequirementsMetamodel.IntentionalElement source) {
		WebRequirementsMetamodel.SR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebRequirementsMetamodel.SR) {
				container = (WebRequirementsMetamodel.SR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.MeansEnd) {
				continue;
			}
			WebRequirementsMetamodel.MeansEnd link = (WebRequirementsMetamodel.MeansEnd) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement dst = link.getEnds();
			WebRequirementsMetamodel.IntentionalElement src = link.getMeans();
			if (src != source) {
				continue;
			}
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002,
					WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Contribution_4003(
			WebRequirementsMetamodel.IntentionalElement source) {
		WebRequirementsMetamodel.SR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebRequirementsMetamodel.SR) {
				container = (WebRequirementsMetamodel.SR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor> result = new LinkedList<WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor>();
		for (Iterator<?> links = container.getIRelationships().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebRequirementsMetamodel.Contribution) {
				continue;
			}
			WebRequirementsMetamodel.Contribution link = (WebRequirementsMetamodel.Contribution) linkObject;
			if (WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID != WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebRequirementsMetamodel.IntentionalElement dst = link
					.getContributed();
			WebRequirementsMetamodel.IntentionalElement src = link
					.getContributor();
			if (src != source) {
				continue;
			}
			result.add(new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelLinkDescriptor(
					src,
					dst,
					link,
					WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003,
					WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

}
