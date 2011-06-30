package WebRequirementsMetamodel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class WebRequirementsMetamodelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public WebRequirementsMetamodelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem> result = new ArrayList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup group = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem navigatorItem = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getVisualID(view)) {

		case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Personalization_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Personalization_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Actor_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Actor_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Goal_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Goal_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup target = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Contribution_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup source = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Contribution_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Service_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Service_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Personalization_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Personalization_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup target = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_MeansEnd_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup source = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_MeansEnd_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Softgoal_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Softgoal_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup target = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_IDependency_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup source = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_IDependency_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Layout_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Layout_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Goal_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Goal_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup links = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_SD_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Softgoal_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Softgoal_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Service_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Service_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Layout_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Layout_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Content_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Content_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Navigational_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Navigational_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Content_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Content_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup incominglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Navigational_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup outgoinglinks = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Navigational_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID: {
			LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem> result = new LinkedList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup target = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Decomposition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup source = new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorGroup(
					WebRequirementsMetamodel.diagram.part.Messages.NavigatorGroupName_Decomposition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
							.getType(WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.MODEL_ID
				.equals(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem> result = new ArrayList<WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem) {
			WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem abstractNavigatorItem = (WebRequirementsMetamodel.diagram.navigator.WebRequirementsMetamodelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
