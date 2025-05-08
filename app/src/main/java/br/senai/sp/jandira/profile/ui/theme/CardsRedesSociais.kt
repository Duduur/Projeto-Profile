package br.senai.sp.jandira.profile.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.profile.R

@Composable
fun CardsRedesSociais(
    IconePaint: Painter = painterResource(R.drawable.image),
    nomeRede: String =  "Nome da rede social",
    background: Color = Color.Transparent
){

    Card (
        modifier = Modifier
            .width(90.dp)
            .height(70.dp),
        colors = CardDefaults.cardColors(containerColor = background),
        border = BorderStroke(1.dp, Color(0xFFA5A8B6))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = IconePaint,
                contentDescription = "",
                modifier = Modifier
                    .size(20.dp)
            )
            Spacer(modifier = Modifier .height(10.dp))
            Text(
                text = nomeRede,
                fontSize =15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFA5A8B6)
            )
        }
    }
}

@Preview
@Composable
private fun CardsRedesSociaisPreview(){
    CardsRedesSociais()
}