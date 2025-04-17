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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lion_school.R

@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
    ){
Column (
    modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Transparent),
        verticalArrangement = Arrangement.SpaceBetween,
    horizontalAlignment = Alignment.CenterHorizontally

){
Row (modifier = Modifier
    .fillMaxWidth()
    .width(400.dp)
    .height(350.dp)
    .padding(top = 45.dp),
    horizontalArrangement = Arrangement.Center,
){
    Image(painter = painterResource(R.drawable.logo)
        , contentDescription = stringResource(R.string.LOGO),
        modifier = Modifier
            .height(250.dp)
            .width(230.dp)
            .padding(top = 20.dp)


}
}
    }
}



@Composable
@Preview
private fun HomeScreenPreview(){
    HomeScreen()
}
