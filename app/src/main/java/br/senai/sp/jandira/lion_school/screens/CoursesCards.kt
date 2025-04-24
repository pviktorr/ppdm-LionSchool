package br.senai.sp.jandira.lion_school.screens

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun CourseCard(
    cursoNome: String = "sigla",
    TextGrande: String = "Nome do curso",
    TextPequeno: String = "Descrição",
    Time: String = "Tempo de curso",
    bulletImg: Painter = painterResource(R.drawable.galeria),

    ) {

    Card(
        modifier = Modifier
            .width(322.dp)
            .height(209.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(
            1.dp,
            Color(0xFFFFC23D)
        )
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF3347B0),
                            Color(0xFFCFD4EA)
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp),
                verticalArrangement = Arrangement.SpaceAround
            )
            {

                Row(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Image(
                        painter = bulletImg, contentDescription = "",
                        modifier = Modifier
                            .padding(bottom = 70.dp)
                            .size(90.dp)
                    )
                    Spacer(modifier = Modifier .width(20.dp))
                    Text(text = cursoNome,
                        fontSize = 50.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xffFFC23D)


                    )
                }
                Column(modifier = Modifier
                    .fillMaxWidth()
                ) {

                }
            }
        }
    }
}

@Preview
@Composable
private fun CoursersCardsPreview() {
    CourseCard()
}