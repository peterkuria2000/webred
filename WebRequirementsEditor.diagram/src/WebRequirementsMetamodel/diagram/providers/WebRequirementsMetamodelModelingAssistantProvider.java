package WebRequirementsMetamodel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class WebRequirementsMetamodelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SDEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			return types;
		}
		if (editPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SR_3001);
			return types;
		}
		if (editPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SREditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			return ((WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelModelingAssistantProviderMessage);
		dialog.setTitle(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
