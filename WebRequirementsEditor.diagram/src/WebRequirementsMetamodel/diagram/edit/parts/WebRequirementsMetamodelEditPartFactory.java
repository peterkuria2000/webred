package WebRequirementsMetamodel.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class WebRequirementsMetamodelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelVisualIDRegistry
					.getVisualID(view)) {

			case WebRequirementsMetamodel.diagram.edit.parts.SDEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.SDEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ContentEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ContentNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ContentNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.NavigationalEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.NavigationalNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.NavigationalNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.PersonalizationEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.PersonalizationNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.GoalEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.GoalNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.SoftgoalEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.SoftgoalNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ServiceEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ServiceNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ServiceNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ActorEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ActorDescriptionEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ActorDescriptionEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.LayoutEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.LayoutNameEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.LayoutNameEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.SREditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.SREditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Service2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ServiceName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ServiceName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Personalization2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.PersonalizationName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.PersonalizationName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Navigational2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.NavigationalName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.NavigationalName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Layout2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.LayoutName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Content2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ContentName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ContentName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Goal2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.GoalName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.Softgoal2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.SoftgoalName2EditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.IDependencyEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.DecompositionEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.MeansEndEditPart(
						view);

			case WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart.VISUAL_ID:
				return new WebRequirementsMetamodel.diagram.edit.parts.ContributionEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
