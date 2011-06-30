package WebRequirementsMetamodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ContributionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ContributionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof WebRequirementsMetamodel.Contribution) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof WebRequirementsMetamodel.IntentionalElement && newEnd instanceof WebRequirementsMetamodel.IntentionalElement)) {
			return false;
		}
		WebRequirementsMetamodel.IntentionalElement target = getLink()
				.getContributed();
		if (!(getLink().eContainer() instanceof WebRequirementsMetamodel.SR)) {
			return false;
		}
		WebRequirementsMetamodel.SR container = (WebRequirementsMetamodel.SR) getLink()
				.eContainer();
		return WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistContribution_4003(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WebRequirementsMetamodel.IntentionalElement && newEnd instanceof WebRequirementsMetamodel.IntentionalElement)) {
			return false;
		}
		WebRequirementsMetamodel.IntentionalElement source = getLink()
				.getContributor();
		if (!(getLink().eContainer() instanceof WebRequirementsMetamodel.SR)) {
			return false;
		}
		WebRequirementsMetamodel.SR container = (WebRequirementsMetamodel.SR) getLink()
				.eContainer();
		return WebRequirementsMetamodel.diagram.edit.policies.WebRequirementsMetamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistContribution_4003(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setContributor(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setContributed(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.Contribution getLink() {
		return (WebRequirementsMetamodel.Contribution) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.IntentionalElement getOldSource() {
		return (WebRequirementsMetamodel.IntentionalElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.IntentionalElement getNewSource() {
		return (WebRequirementsMetamodel.IntentionalElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.IntentionalElement getOldTarget() {
		return (WebRequirementsMetamodel.IntentionalElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.IntentionalElement getNewTarget() {
		return (WebRequirementsMetamodel.IntentionalElement) newEnd;
	}
}
