package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun CoursesScreen() {
    val scroll = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp, start = 10.dp, end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = stringResource(R.string.LOGO),
                    modifier = Modifier
                        .width(40.dp)
                        .height(56.dp)
                        .padding(vertical = 2.dp)
                )
                Text(
                    text = stringResource(R.string.NOME),
                    fontSize = 15.sp,
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .width(50.dp)
                        .padding(bottom = 10.dp)
                )

            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 10.dp)

            )

            OutlinedTextField(
                value = "", onValueChange = {},
                modifier = Modifier

                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(10.dp),
                label = {
                    Text(text = stringResource(R.string.findC))
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFFFC23D),
                    unfocusedContainerColor = Color(0xFFF5F5F5)
                )

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 210.dp, start = 15.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.lion_lista),
                contentDescription = "",
                modifier = Modifier
                    .width(35.dp)
                    .height(36.dp)
            )
            Text(text = stringResource(id = R.string.courses),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3347B0)
            )

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scroll)
                .padding(top = 80.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
    CourseCard(cursoNome = "DS",
            bulletImg = painterResource(R.drawable.ds),
    textGrande = "Desenvolvimento de Sistemas",
    textPequeno = "Learn to develop web and mobile applications ",
    time = "3 semesters"
    )
            CourseCard(cursoNome = "DS",
                bulletImg = painterResource(R.drawable.ds),
                textGrande = "Desenvolvimento de Sistemas",
                textPequeno = "Learn to develop web and mobile applications ",
                time = "3 semesters"
            )



        }
    }

}


@Composable
@Preview
private fun CoursesScreenPreview() {
    CoursesScreen()
}