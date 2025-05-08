package br.senai.sp.jandira.profile.ui.theme

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.profile.R

@Composable
fun ProfileScreen(
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .background(color = Color.Black)
        ){
            Image(
                painter = painterResource(R.drawable.onepiece),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier
                    .padding(20.dp)
            )

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Details",
                    fontSize = 15.sp, fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Spacer(modifier = Modifier .height(28.dp))
                Card(
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp),
                    shape = CircleShape


                ) {
                    Image(
                        painter = painterResource(R.drawable.luffy),
                        contentDescription = "",
                        modifier = Modifier.size(90.dp),
                   )
                }
                Spacer(modifier = Modifier .height(10.dp))
                Text(
                    text = "Monkey'D Luffy",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Sr. 3B/UX Younkou",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF54B7F4)
                )

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top =10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly

                ){
                    CardsRedesSociais(
                        IconePaint =  painterResource(R.drawable.emailddd) ,
                        nomeRede = "Email"
                    )

                    CardsRedesSociais(
                        IconePaint =  painterResource(R.drawable.telefone) ,
                        nomeRede = "Call"
                    )

                    CardsRedesSociais(
                        IconePaint =  painterResource(R.drawable.zap) ,
                        nomeRede = "Whatsapp"
                    )

                    CardsRedesSociais(
                        IconePaint =  painterResource(R.drawable.estrela) ,
                        nomeRede = "Favorite"
                    )


                }
            }

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xFF064D7E)
                    )
                    Spacer(modifier = Modifier .width(10.dp))
                    Text(
                        text = "Email",
                        fontSize = 18.sp
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .padding(top = 14.dp)
                ) {

                    Text(
                        text = "Official",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier .height(4.dp))
                    Text(
                        text = "luffy_muguiwara@gmail.com",
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier .height(20.dp))
                    Text(
                        text = "Personal",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier .height(4.dp))
                    Text(
                        text = "adoro_carne@gmail.com",
                        fontSize = 13.sp
                    )
                }
                HorizontalDivider(
                    modifier = Modifier
                        .padding(top = 20.dp)
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "",
                        tint = Color(0xFF064D7E)
                    )
                    Spacer(modifier = Modifier .width(10.dp))
                    Text(
                        text = "Phone number",
                        fontSize = 18.sp
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .padding(top = 14.dp)
                ) {

                    Text(
                        text = "Mobile",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier .height(4.dp))
                    Text(
                        text = "(11) 99877-07079",
                        fontSize = 13.sp
                    )

                }
                HorizontalDivider(
                    modifier = Modifier
                        .padding(top = 20.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.People,
                        contentDescription = "",
                        tint = Color(0xFF064D7E)
                    )
                    Spacer(modifier = Modifier .width(10.dp))
                    Text(
                        text = "Team",
                        fontSize = 18.sp
                    )

                }
                Column(
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .padding(top = 14.dp)
                ) {
                    Text(
                        text = "(11) 99877-07079",
                        fontSize = 13.sp
                    )

                    Button(onClick = {}) { }

                }
                HorizontalDivider(
                    modifier = Modifier
                        .padding(top = 20.dp)
                )


            }
        }
    }
}

@Preview
@Composable
private fun ProfileScreenPreview(){
   ProfileScreen()
}