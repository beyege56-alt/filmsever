package com.Rowdycado

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class HentaiCityPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(HentaiCity())
    }
}
