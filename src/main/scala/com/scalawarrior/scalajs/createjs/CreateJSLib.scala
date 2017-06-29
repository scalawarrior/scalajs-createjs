package com.scalawarrior.scalajs.createjs

import scala.scalajs.js
import js.annotation._

//@JSGlobal("createjs.EventDispatcher")
//object EventDispatcher extends js.Object {
//  def initialize(target: Object): Unit = js.native
//}

@js.native
@JSGlobal("createjs.Event")
class Event protected () extends js.Object {
  def this(`type`: String, bubbles: Boolean, cancelable: Boolean) = this()
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: js.Any = js.native
  var defaultPrevented: Boolean = js.native
  var eventPhase: Double = js.native
  var immediatePropagationStopped: Boolean = js.native
  var propagationStopped: Boolean = js.native
  var removed: Boolean = js.native
  var target: js.Any = js.native
  var timeStamp: Double = js.native
  var `type`: String = js.native
  var data: js.Any = js.native
  var delta: Double = js.native
  var error: String = js.native
  var id: String = js.native
  var item: js.Any = js.native
  var loaded: Double = js.native
  var name: String = js.native
  var next: String = js.native
  var params: js.Any = js.native
  var paused: Boolean = js.native
  var progress: Double = js.native
  var rawResult: js.Any = js.native
  var result: js.Any = js.native
  var runTime: Double = js.native
  var src: String = js.native
  var time: Double = js.native
  var total: Double = js.native
  override def clone(): Event = js.native
  def preventDefault(): Unit = js.native
  def remove(): Unit = js.native
  def set(props: Object): Event = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
  override def toString(): String = js.native
}

@js.native
@JSGlobal("createjs.EventDispatcher")
class EventDispatcher extends js.Object {
 def addEventListener(`type`: String, listener: js.Function1[Object, Boolean], useCapture: Boolean = ???): js.Function = js.native
 //def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean = ???): Object = js.native
 def dispatchEvent(eventObj: Object, target: Object = ???): Boolean = js.native
 def hasEventListener(`type`: String): Boolean = js.native
 def off(`type`: String, listener: js.Function1[Object, Boolean], useCapture: Boolean = ???): Unit = js.native
 def on(`type`: String, listener: js.Function1[Object, Boolean], scope: Object = ???, once: Boolean = ???, data: js.Any = ???, useCapture: Boolean = ???): js.Function = js.native
 //def on(`type`: String, listener: js.Any, scope: Object = ???, once: Boolean = ???, data: js.Any = ???, useCapture: Boolean = ???): Object = js.native
 def removeAllEventListeners(`type`: String = ???): Unit = js.native
 def removeEventListener(`type`: String, listener: js.Function1[Object, Boolean], useCapture: Boolean = ???): Unit = js.native
 override def toString(): String = js.native
 def willTrigger(`type`: String): Boolean = js.native
}

// //@JSGlobal("createjs")
// @JSGlobal("createjs.EventDispatcher")
// class EventDispatcher extends js.Object {
//   def initialize(target: Object): Unit = js.native
// }
