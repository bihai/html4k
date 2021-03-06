package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class MAP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("map", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent, PhrasingContent {
    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}


}
public val MAP.asFlowContent : FlowContent
    get()  = this

public val MAP.asPhrasingContent : PhrasingContent
    get()  = this


public open class MARK(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("mark", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class MATH(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("math", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class MATHML(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("mathml", consumer, initialAttributes), CommonAttributeGroupFacade {

}

public open class MENU(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("menu", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {
    var type : MenuType
        get()  = attributeMenuTypeEnumMenuTypeValues.get(this, "type")
        set(newValue) {attributeMenuTypeEnumMenuTypeValues.set(this, "type", newValue)}

    var label : String
        get()  = attributeStringString.get(this, "label")
        set(newValue) {attributeStringString.set(this, "label", newValue)}


}
fun MENU.li(classes : String? = null, block : LI.() -> Unit = {}) : Unit = LI(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)


public open class META(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("meta", consumer, initialAttributes), CommonAttributeGroupFacade {
    var httpEquiv : String
        get()  = attributeStringString.get(this, "http-equiv")
        set(newValue) {attributeStringString.set(this, "http-equiv", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var content : String
        get()  = attributeStringString.get(this, "content")
        set(newValue) {attributeStringString.set(this, "content", newValue)}

    var charset : String
        get()  = attributeStringString.get(this, "charset")
        set(newValue) {attributeStringString.set(this, "charset", newValue)}


}

public open class METER(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("meter", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {
    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}

    var min : String
        get()  = attributeStringString.get(this, "min")
        set(newValue) {attributeStringString.set(this, "min", newValue)}

    var max : String
        get()  = attributeStringString.get(this, "max")
        set(newValue) {attributeStringString.set(this, "max", newValue)}

    var low : String
        get()  = attributeStringString.get(this, "low")
        set(newValue) {attributeStringString.set(this, "low", newValue)}

    var high : String
        get()  = attributeStringString.get(this, "high")
        set(newValue) {attributeStringString.set(this, "high", newValue)}

    var optimum : String
        get()  = attributeStringString.get(this, "optimum")
        set(newValue) {attributeStringString.set(this, "optimum", newValue)}


}

