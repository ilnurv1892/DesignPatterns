/*------------------------------------------------------------------------------
 ilnurv : 2021-4-22 7:24
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns

interface USBTypeC
interface USBMini

interface EUPlug
interface USPlug


fun powerOutlet(): USPlug {

    return object : USPlug {}
}

fun cellPhone(chargeCable: USBTypeC) {

}


fun charger(plug: EUPlug): USBMini {
    return object : USBMini {}
}


fun main() {

    charger(powerOutlet().toEUPlug())

    cellPhone(charger(powerOutlet().toEUPlug()).toUSBTypeC())

}


//make extension functions
fun USPlug.toEUPlug(): EUPlug {
    return object : EUPlug {
    }
}

fun USBMini.toUSBTypeC(): USBTypeC {
    return object : USBTypeC {}
}