//Programa : RFID - Controle de Acesso leitor RFID
//Autor : FILIPEFLOP
 
#include <SPI.h>
#include <MFRC522.h>
#include <LiquidCrystal.h>
 
#define SS_PIN 10
#define RST_PIN 9
MFRC522 mfrc522(SS_PIN, RST_PIN);   // Create MFRC522 instance.
 
LiquidCrystal lcd(6, 7, 5, 4, 3, 2); 
 
char st[20];
 
void setup() 
{
  Serial.begin(9600);   // Inicia a serial
  SPI.begin();      // Inicia  SPI bus
  mfrc522.PCD_Init();   // Inicia MFRC522
  Serial.println("Aproxime o seu cartao do leitor...");
  Serial.println();
  //Define o número de colunas e linhas do LCD:  
  lcd.begin(16, 2);  
  mensageminicial();
}
 
void loop() 
{
  // Look for new cards
  if ( ! mfrc522.PICC_IsNewCardPresent()) 
  {
    return;
  }
  // Select one of the cards
  if ( ! mfrc522.PICC_ReadCardSerial()) 
  {
    return;
  }
  //Mostra UID na serial
  Serial.print("UID da tag :");
  String conteudo= "";
  byte letra;
  for (byte i = 0; i < mfrc522.uid.size; i++) 
  {
     Serial.print(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " ");
     Serial.print(mfrc522.uid.uidByte[i], HEX);
     conteudo.concat(String(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " "));
     conteudo.concat(String(mfrc522.uid.uidByte[i], HEX));
  }
  Serial.println();
  Serial.print("Mensagem : ");
  conteudo.toUpperCase();
  if (conteudo.substring(1) == "1A 49 C5 80") //UID 1 - Chaveiro
  {
    Serial.println("Ola Z! ><");
    Serial.println();
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("Ola Z! ><");
    lcd.setCursor(0,1);
    lcd.print("Acesso Negado");
    delay(3000);
    mensageminicial();
  }
 
  if (conteudo.substring(1) == "43 E0 1B 16") //UID 2 - Cartao
  {
    Serial.println("Ola Maria!! :D");
    Serial.println();
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("Ola Maria!! :D");
    lcd.setCursor(0,1);
    lcd.print("Acesso Liberado !");
    delay(3000);
    mensageminicial();
  }
  
  if (conteudo.substring(1) == "25 AA 05 88") //UID 2 - Cartao
  {
    Serial.println("Ola Y! '-'");
    Serial.println();
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("Ola Y ヤ uwu");
    lcd.setCursor(0,1);
    lcd.print("Acesso Duvidoso");
    delay(3000);
    mensageminicial();
  }
  
  if (conteudo.substring(1) == "2A FE 09 85") //UID 2 - Cartao
  {
    Serial.println("Ola N! ;-;");
    Serial.println();
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("Ola N! ;-;");
    lcd.setCursor(0,1);
    lcd.print("TENEBROSO . . .");
    delay(3000);
    mensageminicial();
  }
} 
 
void mensageminicial()
{
  lcd.clear();
  lcd.print(" Aproxime o seu");  
  lcd.setCursor(0,1);
  lcd.print("cartao do leitor");  
}