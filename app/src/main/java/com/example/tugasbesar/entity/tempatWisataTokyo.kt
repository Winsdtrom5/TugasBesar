package com.example.tugasbesar.entity

class tempatWisataTokyo(var name : String, var alamat : String, var rating : Double) {
    companion object{
        @JvmField
        var listOftempatWisata = arrayOf(
            tempatWisataTokyo("Shinjuku Gyoen National Garden", "11 Naitomachi, Shinjuku City", 4.9),
            tempatWisataTokyo("Sensō-ji Temple", "2 Chome-3-1 Asakusa, Taito", 4.9),
            tempatWisataTokyo("Tokyo Skytree"," 1 Chome-1-2 Oshiage, Sumida City",5.0),
            tempatWisataTokyo("Tsukiji Outer Market","4 Chome-16-2 Tsukiji, Chuo-ku",4.7),
            tempatWisataTokyo("Meiji Shrine","1-1 Yoyogikamizonocho, Shibuya City",4.3),
            tempatWisataTokyo("Imperial Palace","1-1 Chiyoda, Chiyoda City",4.3),
            tempatWisataTokyo("Disney Land Tokyo","1-1 Maihama, Urayasu, Chiba 279-0031",4.3),
            tempatWisataTokyo("Tokyo Tower"," 4 Chome-2-8 Shibakoen, Minato City",4.3)
        )
    }
}