package html4k

import html4k.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

enum public class Draggable(override val realValue : String) : AttributeEnum {
    true_ : Draggable("true")
    false_ : Draggable("false")
    auto : Draggable("auto")
}

val draggableValues : Map<String, Draggable> = Draggable.values().toMap { it.name() }

enum public class Runat(override val realValue : String) : AttributeEnum {
    server : Runat("server")
}

val runatValues : Map<String, Runat> = Runat.values().toMap { it.name() }

enum public class Dir(override val realValue : String) : AttributeEnum {
    ltr : Dir("ltr")
    rtl : Dir("rtl")
}

val dirValues : Map<String, Dir> = Dir.values().toMap { it.name() }
