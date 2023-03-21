package br.senai.jandira.sp.mylogin.model

import androidx.compose.ui.graphics.painter.Painter

data class Categories(
    var id: Int = 0,
    var name: String = "",
    var image: Painter? = null,
) {

}
