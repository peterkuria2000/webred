package WebRequirementsMetamodel.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Layout2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Layout2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new WebRequirementsMetamodel.diagram.edit.policies.Layout2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new LayoutFigure();
	}

	/**
	 * @generated
	 */
	public LayoutFigure getPrimaryShape() {
		return (LayoutFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart) {
			((WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLayoutNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
				.getType(WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		if (targetEditPart instanceof WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		} else if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		} else if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		} else if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002);
		types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.IDependency_4004) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Actor_2007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		} else if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Decomposition_4001) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		} else if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.MeansEnd_4002) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		} else if (relationshipType == WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Contribution_4003) {
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_2001);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_2002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_2003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_2004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_2005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_2006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_2008);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Service_3002);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Personalization_3003);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Navigational_3004);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Layout_3005);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Content_3006);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Goal_3007);
			types.add(WebRequirementsMetamodel.diagram.providers.WebRequirementsMetamodelElementTypes.Softgoal_3008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class LayoutFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLayoutNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLayoutCriticalityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLayoutEvaluationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLayoutInitialStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLayoutSolicitedByFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLayoutImplementedInFigure;

		/**
		 * @generated
		 */
		public LayoutFigure() {
			this.setLayoutManager(new XYLayout());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLayoutNameFigure = new WrappingLabel();
			fFigureLayoutNameFigure.setText("<...>");

			this.add(fFigureLayoutNameFigure);

			fFigureLayoutCriticalityFigure = new WrappingLabel();
			fFigureLayoutCriticalityFigure.setText("<...>");

			this.add(fFigureLayoutCriticalityFigure);

			fFigureLayoutEvaluationFigure = new WrappingLabel();
			fFigureLayoutEvaluationFigure.setText("<...>");

			this.add(fFigureLayoutEvaluationFigure);

			fFigureLayoutInitialStatusFigure = new WrappingLabel();
			fFigureLayoutInitialStatusFigure.setText("<...>");

			this.add(fFigureLayoutInitialStatusFigure);

			fFigureLayoutSolicitedByFigure = new WrappingLabel();
			fFigureLayoutSolicitedByFigure.setText("<...>");

			this.add(fFigureLayoutSolicitedByFigure);

			fFigureLayoutImplementedInFigure = new WrappingLabel();
			fFigureLayoutImplementedInFigure.setText("<...>");

			this.add(fFigureLayoutImplementedInFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLayoutNameFigure() {
			return fFigureLayoutNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLayoutCriticalityFigure() {
			return fFigureLayoutCriticalityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLayoutEvaluationFigure() {
			return fFigureLayoutEvaluationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLayoutInitialStatusFigure() {
			return fFigureLayoutInitialStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLayoutSolicitedByFigure() {
			return fFigureLayoutSolicitedByFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLayoutImplementedInFigure() {
			return fFigureLayoutImplementedInFigure;
		}

	}

}
