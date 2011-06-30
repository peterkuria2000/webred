package WebRequirementsMetamodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SDItemSemanticEditPolicy
		extends
		WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SDItemSemanticEditPolicy() {
		super(
				WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SD_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.ContentCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.NavigationalCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.PersonalizationCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.GoalCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.SoftgoalCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.ServiceCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.ActorCreateCommand(
					req));
		}
		if (WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008 == req
				.getElementType()) {
			return getGEFWrapper(new WebRequirementsMetamodel.diagram.edit.commands.LayoutCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
