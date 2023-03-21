package br.senai.jandira.sp.mylogin.DAO.repository

import androidx.compose.runtime.Composable
import br.senai.jandira.sp.mylogin.R
import androidx.compose.ui.res.painterResource
import br.senai.jandira.sp.mylogin.model.Categories

class categoriesRepository {
    companion object {

        @Composable
        fun getCategoriesList(): List<Categories> {
            return listOf<Categories>(
                Categories(
                    1,
                    "Montain",
                    image = painterResource(id = R.drawable.elipse2)
                ),
                Categories(
                    2,
                    "Snow",
                    image = painterResource(id = R.drawable.ellipse3)
                ),
                Categories(
                    3,
                    "Beach",
                    image = painterResource(id = R.drawable.ellipse4)
                )
            )
        }
    }
}