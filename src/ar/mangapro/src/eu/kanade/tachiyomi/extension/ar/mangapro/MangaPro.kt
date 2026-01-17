package eu.kanade.tachiyomi.extension.ar.mangapro

import eu.kanade.tachiyomi.multisrc.iken.Iken

class MangaPro : Iken(
    "Manga Pro",
    "ar",
    "https://www.prochan.net",     // تم تحديث الرابط هنا
    "https://api.prochan.net",     // تم تحديث رابط الـ API (افتراضاً يتبع نفس النطاق)
) {
    override val versionId = 4
}
