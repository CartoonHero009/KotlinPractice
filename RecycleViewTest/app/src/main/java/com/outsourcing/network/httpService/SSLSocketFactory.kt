package com.outsourcing.network.httpService

import java.io.File
import java.io.FileInputStream
import java.security.KeyStore
import java.security.SecureRandom
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManagerFactory

fun getSSLSocketFactory(): SSLSocketFactory {
    var sslContext: SSLContext? = null
    try {
        val keyStore = KeyStore.getInstance("PKCS12")
        val certificate = FileInputStream(File("tomcat.keystore"))
        keyStore.load(certificate, "somnus".toCharArray())

        sslContext = SSLContext.getInstance("TLS")
        val trustManagerFactory = TrustManagerFactory
            .getInstance(TrustManagerFactory.getDefaultAlgorithm())
        trustManagerFactory.init(keyStore)
        sslContext!!.init(null, trustManagerFactory.getTrustManagers(), SecureRandom())
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return sslContext!!.getSocketFactory()
}