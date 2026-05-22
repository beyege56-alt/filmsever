// use an integer for version numbers
<<<<<<< HEAD
version = 2


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Watch Anime From Hentai.pro"
    authors = listOf("Phisher98")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "NSFW",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=animeidhentai.com&sz=%size%"
}
=======
version = 7


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = ""
    authors = listOf("Jace")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1 // will be 3 if unspecified

    // List of video source types. Users are able to filter for extensions in a given category.
    // You can find a list of avaliable types here:
    // https://recloudstream.github.io/cloudstream/html/app/com.lagradost.cloudstream3/-tv-type/index.html
    tvTypes = listOf("NSFW")

    iconUrl = "https://www.google.com/s2/favicons?domain=hentaihaven.xxx&sz=%size%"

    language = "en"
}
>>>>>>> ffe409a (4 site eklendi: HentaiHaven, Hanime, HentaiCity, PimpBunny)
