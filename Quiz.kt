// Quiz wiedzy na temat Polski
// Twórca Emilian Filoda
// Luty 2020

/* Na każde pytanie ma się dwa podejsćia, za pierwszym razem otrzymuje się dwa punkty, jeśli poda się prowidłową
odowiedź za drugim razem otzymuję sie tylko jeden punkt, w przypadku dwukrotnego udzienlania złej odpowiedzi otrzymuje
się zero punktu i przechodzi do następnego pytania
Na koniec zapis wyniku do pliku
 */



fun main(args: Array<String>) {

    println("QUIZ NA TEAMAT WIEDZY O POLSCE")

    var punktyGracza: Int = 0

    println("Pytanie 1:")
    println("Jak nazywa się największa rzeka dzieląca Polskę z Niemcami?:")

    val odpPyt1: String = "ODRA"
    var udzielonaOdp1: String?

    while (true) {
        udzielonaOdp1 = readLine()!!.toUpperCase()
        if (odpPyt1 == udzielonaOdp1) {
            punktyGracza++
            punktyGracza++       //jak dodac dwa punkty inaczej?
            break
        } else {
            println("Spróbuj jeszcze raz!")
            udzielonaOdp1 = readLine()!!.toUpperCase()
            if (odpPyt1 == udzielonaOdp1) {
                punktyGracza++

                break
            } else {
                break
            }
        }
    }
    println("Pytanie 2:")

    val kasprowy: String = "A"
    val rysy: String = "B"
    var udzielonaOdp2: String?

    println("Który z wynienionych szczytów jest najwyższy?")
    println("(A) Kasprowy (B) Rysy")

    while(true){
        udzielonaOdp2 = readLine()!!.toUpperCase()
        if(udzielonaOdp2 == rysy){
            punktyGracza++
            punktyGracza++
            break
        }
        else{
            println("Spróbuj jeszcze raz!")
            udzielonaOdp2 = readLine()!!.toUpperCase()
            if(udzielonaOdp2 == rysy){
            punktyGracza++
            break}
            else{break
        }
        }


    }
    println("Pytanie 3:")

    val chrzest = 966
    var udzielonaOdp3: Int?

    println("W którym roku odbył się chrzest Polski?:")

    udzielonaOdp3 = readLine()!!.toInt()

    when(udzielonaOdp3) {
            966 -> println("Dobrze!") // miało być coś w stylu punktyGracza++, punktyGracza++
            in 0..965 -> println("To wydarzyło się później") // Spóbuj jeszcze raz, i powrót do pytania, ale juz tylko za jeden punkt, ale nie wiem jak, i tu utknąłem, bo nic mi nie działa
            in 967..1200 -> println("To wydarzyło się wcześniej")
            else -> println("Nie masz bladego pojecia")
    }



    print("Twoje punkty: $punktyGracza")
}