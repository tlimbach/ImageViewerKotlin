import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.FlowPane
import javafx.scene.layout.Priority
import javafx.scene.layout.VBox
import java.io.File

class RightPane : VBox(10.0) {
    init {
        padding = Insets(10.0)
        style = "-fx-background-color: #ffffff"
        VBox.setVgrow(this, Priority.ALWAYS)
    }

    fun showThumbnails(images: List<File>) {
        children.clear()
        children += Label("Vorschau:")
        val flow = FlowPane().apply {
            hgap = 10.0
            vgap = 10.0
            padding = Insets(10.0)
        }
        for (file in images) {
            val image = Image(file.toURI().toString(), 100.0, 100.0, true, true)
            val view = ImageView(image).apply {
                fitWidth = 100.0
                fitHeight = 100.0
                isPreserveRatio = true
            }
            flow.children += view
        }
        children += flow
    }
}