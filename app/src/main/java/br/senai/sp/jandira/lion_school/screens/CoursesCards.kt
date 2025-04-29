package br.senai.sp.jandira.lion_school.screens


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
    cursoNome: String = "SGL",
    textGrande: String = "Nome do curso",
    textPequeno: String = "Descrição",
    bulletImg: Painter = painterResource(R.drawable.galeria),
    background: Brush = Brush.horizontalGradient(
        listOf(
            Color(0xff3347B0),
            Color(0xffCFD4EA),
        )
    ),
    time: String = "Tempo do Curso",
    clock: Painter = painterResource(R.drawable.relogio)

) {

    Card(
        modifier = Modifier
            .width(320.dp)
            .height(210.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(
            2.dp,
            Color(0xFFFFC23D)
        )
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(background)

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

                            .size(60.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = cursoNome,
                        fontSize = 64.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xffFFC23D)


                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(start = 15.dp)
                ) {
                    Text(
                        text = textGrande,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                    Text(
                        text = textPequeno,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White


                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, top = 20.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Image(
                        painter = clock, contentDescription = "",
                        modifier = Modifier
                            .size(13.dp)
                    )
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )
                    Text(text = time,
                        fontWeight = FontWeight.SemiBold ,
                        fontSize = 10.sp,
                        color = Color.White


                    )



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