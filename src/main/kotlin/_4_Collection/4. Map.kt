package _4_Collection

fun main() {
    val maps = mapOf<String, String>(
        Pair("Bobby", "Echo"),
        "Sarah" to "Ra"
    )

    val mutableMaps = mutableMapOf<String, String>(
        Pair("Dibop", "Dota"),
        "Ra" to "Ayodance"
    )

    println(maps.get("Dibyo"))
    println(maps.get("Bobby"))
    println(maps.getOrDefault("Dibyo", "Nothing"))
    println(maps.getOrElse("Dibyo") { "Dibyo" })
    println(maps.values)

    println(maps.entries)

    println(maps.keys)

    for ((key, value) in maps) {
        println("key: $key, value: $value")
    }

    mutableMaps["Dibyo"] = "Dota"

    println(mutableMaps.values)

    for (value in mutableMaps.values) {
        println(value)
    }

    println(mutableMaps.entries)

    for (key in mutableMaps.keys) {
        println(key)
    }

    println(mutableMaps.keys)


    for ((key, value) in mutableMaps) {
        println("key: $key, value: $value")
    }
}