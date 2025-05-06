package br.senai.sp.jandira.projeto_profile


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xA9990BD5))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp)
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
                }
                Text("Details", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Spacer(modifier = Modifier.width(48.dp))
            }

            Spacer(modifier = Modifier.height(24.dp))

            Image(
                painter = painterResource(id = R.drawable.human),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)

            )

            Spacer(modifier = Modifier.height(16.dp))

            Text("Jenny Wilson", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text("Sr. UI/UX Designer", color = Color(0xFFD1C4E9), fontSize = 16.sp)

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                RoundedSquareIconButton(
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(Icons.Filled.Email, contentDescription = "Email", tint = Color.White, modifier = Modifier.size(24.dp))
                    },
                    text = "Email"
                )
                RoundedSquareIconButton(
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(Icons.Filled.Call, contentDescription = "Call", tint = Color.White, modifier = Modifier.size(24.dp))
                    },
                    text = "Call"
                )
                RoundedSquareIconButton(
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(painterResource(id = R.drawable.whatsapp), contentDescription = "WhatsApp", tint = Color.White, modifier = Modifier.size(24.dp))
                    },
                    text = "Whatsapp"
                )
                RoundedSquareIconButton(
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(Icons.Filled.Star, contentDescription = "Favorite", tint = Color.White, modifier = Modifier.size(24.dp))
                    },
                    text = "Favorite"
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFFFFF))
                    .padding(16.dp)
            ) {
                Text("Email", color = Color(0xFF757575), fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Official", color = Color(0xFF757575), fontSize = 14.sp)
                Text("michael.mitc@example.com", color = Color(0xFF212121), fontSize = 16.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Personal", color = Color(0xFF757575), fontSize = 14.sp)
                Text("michael@example.com", color = Color(0xFF212121), fontSize = 16.sp)

                Spacer(modifier = Modifier.height(16.dp))
                Divider(color = Color(0xFFE0E0E0), thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text("Phone number", color = Color(0xFF757575), fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Text("Mobile", color = Color(0xFF757575), fontSize = 14.sp)
                        Text("(209) 555-0104", color = Color(0xFF212121), fontSize = 16.sp)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Send, contentDescription = "Send", tint = Color(0xFF757575))
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                Divider(color = Color(0xFFE0E0E0), thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text("Team", color = Color(0xFF757575), fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Text("Project Operation Team", color = Color(0xFF212121), fontSize = 16.sp)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painterResource(id = R.drawable.lado1), contentDescription = "View Team", tint = Color(0xFF4B0082))
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                Divider(color = Color(0xFFE0E0E0), thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text("Leads by", color = Color(0xFF757575), fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Text("Darrell Steward", color = Color(0xFF212121), fontSize = 16.sp)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painterResource(id = R.drawable.lado1), contentDescription = "View Leads", tint = Color(0xFF4B0082))
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(painterResource(id = R.drawable.user), contentDescription = "Add Contact", tint = Color(0xFF4B0082))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text("Add to contact", color = Color(0xFF4B0082), fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painterResource(id = R.drawable.share), contentDescription = "Share")
                    }
                }
            }
        }
    }
}

@Composable
fun RoundedSquareIconButton(
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    text: String
) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(64.dp)
            .background(Color(0x33FFFFFF), RoundedCornerShape(8.dp))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color(0x80FFFFFF), RoundedCornerShape(6.dp)),
                contentAlignment = Alignment.Center
            ) {
                icon()
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text, color = Color.White, fontSize = 12.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}