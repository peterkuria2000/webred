package WebRequirementsMetamodel.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
