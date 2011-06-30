package WebRequirementsMetamodel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SRItemSemanticEditPolicy
		extends
		WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SRItemSemanticEditPolicy() {
		super(
				WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SR_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Service2CreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Personalization2CreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Navigational2CreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Layout2CreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Content2CreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Goal2CreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.Softgoal2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(node)) {
			case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(incomingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getVisualID(outgoingLink) == WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
