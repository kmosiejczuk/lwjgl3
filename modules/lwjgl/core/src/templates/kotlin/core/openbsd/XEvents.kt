/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.openbsd

import org.lwjgl.generator.*

val XAnyEvent = struct(Module.CORE_OPENBSD, "XAnyEvent") {
	int("type")
	unsigned_long("serial")
	Bool("send_event")
	Display.p("display")
	Window("window")
}

val XKeyEvent = struct(Module.CORE_OPENBSD, "XKeyEvent") {
	int("type")
	XAnyEvent copy "serial"
	XAnyEvent copy "send_event"
	XAnyEvent copy "display"
	XAnyEvent copy "window"
	Window("root")
	Window("subwindow")
	Time("time")
	int("x")
	int("y")
	int("x_root")
	int("y_root")
	unsigned_int("state")
	unsigned_int("keycode")
	Bool("same_screen")
}

val XEvent = union(Module.CORE_OPENBSD, "XEvent", mutable = false) {
	int("type")

	XAnyEvent("xany")
	XKeyEvent("xkey")
	struct(Module.CORE_OPENBSD, "XButtonEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		XKeyEvent copy "root"
		XKeyEvent copy "subwindow"
		XKeyEvent copy "time"
		XKeyEvent copy "x"
		XKeyEvent copy "y"
		XKeyEvent copy "x_root"
		XKeyEvent copy "y_root"
		unsigned_int("state")
		unsigned_int("button")
		XKeyEvent copy "same_screen"
	}("xbutton")
	struct(Module.CORE_OPENBSD, "XMotionEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		XKeyEvent copy "root"
		XKeyEvent copy "subwindow"
		XKeyEvent copy "time"
		XKeyEvent copy "x"
		XKeyEvent copy "y"
		XKeyEvent copy "x_root"
		XKeyEvent copy "y_root"
		unsigned_int("state")
		char("is_hint")
		Bool("same_screen")
	}("xmotion")
	struct(Module.CORE_OPENBSD, "XCrossingEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		XKeyEvent copy "root"
		XKeyEvent copy "subwindow"
		XKeyEvent copy "time"
		XKeyEvent copy "x"
		XKeyEvent copy "y"
		XKeyEvent copy "x_root"
		XKeyEvent copy "y_root"
		int("mode")
		int("detail")
		int("same_screen")
		int("focus")
		unsigned_int("state")
	}("xcrossing")
	struct(Module.CORE_OPENBSD, "XFocusChangeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("mode")
		int("detail")
	}("xfocus")
	struct(Module.CORE_OPENBSD, "XExposeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("x")
		int("y")
		int("width")
		int("height")
		int("count")
	}("xexpose")
	struct(Module.CORE_OPENBSD, "XGraphicsExposeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Drawable("drawable")
		int("x")
		int("y")
		int("width")
		int("height")
		int("count")
		int("major_code")
		int("minor_code")
	}("xgraphicsexpose")
	struct(Module.CORE_OPENBSD, "XNoExposeEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Drawable("drawable")
		int("major_code")
		int("minor_code")
	}("xnoexpose")
	struct(Module.CORE_OPENBSD, "XVisibilityEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("state")
	}("xvisibility")
	struct(Module.CORE_OPENBSD, "XCreateWindowEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
		int("x")
		int("y")
		int("width")
		int("height")
		int("border_width")
		int("override_redirect")
	}("xcreatewindow")
	struct(Module.CORE_OPENBSD, "XDestroyWindowEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
	}("xdestroywindow")
	struct(Module.CORE_OPENBSD, "XUnmapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("from_configure")
	}("xunmap")
	struct(Module.CORE_OPENBSD, "XMapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("override_redirect")
	}("xmap")
	struct(Module.CORE_OPENBSD, "XMapRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
	}("xmaprequest")
	struct(Module.CORE_OPENBSD, "XReparentEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		Window("parent")
		int("x")
		int("y")
		int("override_redirect")
	}("xreparent")
	struct(Module.CORE_OPENBSD, "XConfigureEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("x")
		int("y")
		int("width")
		int("height")
		int("border_width")
		Window("above")
		Bool("override_redirect")
	}("xconfigure")
	struct(Module.CORE_OPENBSD, "XGravityEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("x")
		int("y")
	}("xgravity")
	struct(Module.CORE_OPENBSD, "XResizeRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("width")
		int("height")
	}("xresizerequest")
	struct(Module.CORE_OPENBSD, "XConfigureRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
		int("x")
		int("y")
		int("width")
		int("height")
		int("border_width")
		Window("above")
		int("detail")
		unsigned_long("value_mask")
	}("xconfigurerequest")
	struct(Module.CORE_OPENBSD, "XCirculateEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("event")
		Window("window")
		int("place")
	}("xcirculate")
	struct(Module.CORE_OPENBSD, "XCirculateRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("parent")
		Window("window")
		int("place")
	}("xcirculaterequest")
	struct(Module.CORE_OPENBSD, "XPropertyEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("atom")
		Time("time")
		int("state")
	}("xproperty")
	struct(Module.CORE_OPENBSD, "XSelectionClearEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("selection")
		Time("time")
	}("xselectionclear")
	struct(Module.CORE_OPENBSD, "XSelectionRequestEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("owner")
		Window("requestor")
		Atom("selection")
		Atom("target")
		Atom("property")
		Time("time")
	}("xselectionrequest")
	struct(Module.CORE_OPENBSD, "XSelectionEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		Window("requestor")
		Atom("selection")
		Atom("target")
		Atom("property")
		Time("time")
	}("xselection")
	struct(Module.CORE_OPENBSD, "XColormapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Colormap("colormap")
		int("new")
		int("state")
	}("xcolormap")
	struct(Module.CORE_OPENBSD, "XClientMessageEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		Atom("message_type")
		int("format")
		struct {
			char("b")[20]
			short("s")[10]
			long("l")[5]
		}("data")
	}("xclient")
	struct(Module.CORE_OPENBSD, "XMappingEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		int("request")
		int("first_keycode")
		int("count")
	}("xmapping")
	struct(Module.CORE_OPENBSD, "XErrorEvent") {
		int("type")
		Display.p("display")
		XID("resourceid")
		unsigned_long("serial")
		unsigned_char("error_code")
		unsigned_char("request_code")
		unsigned_char("minor_code")
	}("xerror")
	struct(Module.CORE_OPENBSD, "XKeymapEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		XAnyEvent copy "window"
		char("key_vector")[32]
	}("xkeymap")
	struct(Module.CORE_OPENBSD, "XGenericEvent") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		int("extension")
		int("evtype")
	}("xgeneric")
	struct(Module.CORE_OPENBSD, "XGenericEventCookie") {
		int("type")
		XAnyEvent copy "serial"
		XAnyEvent copy "send_event"
		XAnyEvent copy "display"
		int("extension")
		int("evtype")
		unsigned_int("cookie")
		void.p("data")
	}("xcookie")

	long.padding(24)
}

val XTimeCoord = struct(Module.CORE_OPENBSD, "XTimeCoord", mutable = false) {
    Time("time")
    short("x")
	short("y")
}
