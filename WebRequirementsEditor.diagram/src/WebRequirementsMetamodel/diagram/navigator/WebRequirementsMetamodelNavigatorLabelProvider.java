package WebRequirementsMetamodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class WebRequirementsMetamodelNavigatorLabelProvider extends
		LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem
				&& !isOwnView(((WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup group = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup) element;
			return WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem navigatorItem = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Personalization", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Actor", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Goal", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://WebRequirementsMetamodel?Contribution", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Service", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Personalization", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://WebRequirementsMetamodel?MeansEnd", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Softgoal", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://WebRequirementsMetamodel?IDependency", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Layout", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?SR", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SR_3001); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Goal", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://WebRequirementsMetamodel?SD", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.SD_1000); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Softgoal", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Service", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Layout", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Content", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://WebRequirementsMetamodel?Navigational", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Content", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://WebRequirementsMetamodel?Navigational", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002); //$NON-NLS-1$
		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://WebRequirementsMetamodel?Decomposition", WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
						.isKnownElementType(elementType)) {
			image = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup group = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem navigatorItem = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {
		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
			return getPersonalization_3003Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2007Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_3007Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
			return getContribution_4003Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
			return getService_2006Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
			return getPersonalization_2003Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4002Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2005Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
			return getIDependency_4004Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
			return getLayout_2008Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
			return getSR_3001Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_2004Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
			return getSD_1000Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3008Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
			return getService_3002Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
			return getLayout_3005Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
			return getContent_3006Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
			return getNavigational_3004Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
			return getContent_2001Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
			return getNavigational_2002Text(view);
		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
			return getDecomposition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getIDependency_4004Text(View view) {
		WebRequirementsMetamodel.IDependency domainModelElement = (WebRequirementsMetamodel.IDependency) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSR_3001Text(View view) {
		WebRequirementsMetamodel.SR domainModelElement = (WebRequirementsMetamodel.SR) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_3008Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_2006Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContent_3006Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_3002Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPersonalization_3003Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContribution_4003Text(View view) {
		WebRequirementsMetamodel.Contribution domainModelElement = (WebRequirementsMetamodel.Contribution) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2004Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNavigational_3004Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2005Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayout_3005Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSD_1000Text(View view) {
		WebRequirementsMetamodel.SD domainModelElement = (WebRequirementsMetamodel.SD) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeansEnd_4002Text(View view) {
		WebRequirementsMetamodel.MeansEnd domainModelElement = (WebRequirementsMetamodel.MeansEnd) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayout_2008Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContent_2001Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecomposition_4001Text(View view) {
		WebRequirementsMetamodel.Decomposition domainModelElement = (WebRequirementsMetamodel.Decomposition) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDescription();
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_3007Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_2007Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.ActorDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPersonalization_2003Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNavigational_2002Text(View view) {
		IParser parser = WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelParserProvider
				.getParser(
						WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002,
						view.getElement() != null ? view.getElement() : view,
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
								.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
				.equals(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
						.getModelID(view));
	}

}
