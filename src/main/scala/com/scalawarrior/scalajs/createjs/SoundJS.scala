package com.scalawarrior.scalajs.createjs

import scala.scalajs.js
import js.annotation._
import org.scalajs.dom.raw._

@JSName("createjs.AbstractPlugin")
class AbstractPlugin extends js.Object {
  def create(src: String, startTime: Double, duration: Double): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadComplete(src: String): Boolean = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def isSupported(): Boolean = js.native
  def preload(loader: Object): Unit = js.native
  def register(loadItem: String, instances: Double): Object = js.native
  def removeAllSounds(src: String): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
}

@JSName("createjs.AbstractSoundInstance")
class AbstractSoundInstance protected () extends EventDispatcher {
  def this(src: String, startTime: Double, duration: Double, playbackResource: Object) = this()
  var duration: Double = js.native
  var loop: Double = js.native
  var muted: Boolean = js.native
  var pan: Double = js.native
  var paused: Boolean = js.native
  var playbackResource: Object = js.native
  var playState: String = js.native
  var position: Double = js.native
  var src: String = js.native
  var uniqueId: String = js.native
  var volume: Double = js.native
  def destroy(): Unit = js.native
  def getDuration(): Double = js.native
  def getLoop(): Double = js.native
  def getMute(): Boolean = js.native
  def getPan(): Double = js.native
  def getPaused(): Boolean = js.native
  def getPosition(): Double = js.native
  def getVolume(): Double = js.native
  def play(interrupt: String = ???, delay: Double = ???, offset: Double = ???, loop: Double = ???, volume: Double = ???, pan: Double = ???): AbstractSoundInstance = js.native
  def setDuration(value: Double): AbstractSoundInstance = js.native
  def setLoop(value: Double): Unit = js.native
  def setMute(value: Boolean): AbstractSoundInstance = js.native
  def setPan(value: Double): AbstractSoundInstance = js.native
  def setPlayback(value: Object): AbstractSoundInstance = js.native
  def setPosition(value: Double): AbstractSoundInstance = js.native
  def setVolume(value: Double): AbstractSoundInstance = js.native
  def stop(): AbstractSoundInstance = js.native
}

@JSName("createjs.FlashAudioLoader")
class FlashAudioLoader extends AbstractLoader {
  var flashId: String = js.native
  def setFlash(flash: Object): Unit = js.native
}

@JSName("createjs.FlashAudioPlugin")
class FlashAudioPlugin extends AbstractPlugin {
  var flashReady: Boolean = js.native
  var showOutput: Boolean = js.native
}

@JSName("createjs.FlashAudioPlugin")
object FlashAudioPlugin extends js.Object {
  var swfPath: String = js.native
  def isSupported(): Boolean = js.native
}

@JSName("createjs.FlashAudioSoundInstance")
class FlashAudioSoundInstance protected () extends AbstractSoundInstance {
  def this(src: String, startTime: Double, duration: Double, playbackResource: Object) = this()
}

@JSName("createjs.FlashPlugin")
class FlashPlugin extends js.Object {
  var flashReady: Boolean = js.native
  var showOutput: Boolean = js.native
  def create(src: String): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def preload(src: String, instance: Object): Unit = js.native
  def register(src: String, instances: Double): Object = js.native
  def removeAllSounds(): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
}

@JSName("createjs.FlashPlugin")
object FlashPlugin extends js.Object {
  var buildDate: String = js.native
  var swfPath: String = js.native
  var version: String = js.native
  def isSupported(): Boolean = js.native
}

@JSName("createjs.HTMLAudioPlugin")
class HTMLAudioPlugin extends AbstractPlugin {
  var defaultNumChannels: Double = js.native
  var enableIOS: Boolean = js.native
}

@JSName("createjs.HTMLAudioPlugin")
object HTMLAudioPlugin extends js.Object {
  var MAX_INSTANCES: Double = js.native
  def isSupported(): Boolean = js.native
}

@JSName("createjs.HTMLAudioSoundInstance")
class HTMLAudioSoundInstance protected () extends AbstractSoundInstance {
  def this(src: String, startTime: Double, duration: Double, playbackResource: Object) = this()
}

@JSName("createjs.HTMLAudioTagPool")
class HTMLAudioTagPool extends js.Object {
}

@JSName("createjs.Sound")
class Sound extends EventDispatcher {
}

@JSName("createjs.Sound")
object Sound extends js.Object {
  var activePlugin: Object = js.native
  var alternateExtensions: js.Array[js.Any] = js.native
  var defaultInterruptBehavior: String = js.native
  var EXTENSION_MAP: Object = js.native
  var INTERRUPT_ANY: String = js.native
  var INTERRUPT_EARLY: String = js.native
  var INTERRUPT_LATE: String = js.native
  var INTERRUPT_NONE: String = js.native
  var PLAY_FAILED: String = js.native
  var PLAY_FINISHED: String = js.native
  var PLAY_INITED: String = js.native
  var PLAY_INTERRUPTED: String = js.native
  var PLAY_SUCCEEDED: String = js.native
  var SUPPORTED_EXTENSIONS: js.Array[String] = js.native
  def createInstance(src: String): AbstractSoundInstance = js.native
  def getCapabilities(): Object = js.native
  def getCapability(key: String): Double = js.native
  def getMute(): Boolean = js.native
  def getVolume(): Double = js.native
  def initializeDefaultPlugins(): Boolean = js.native
  def isReady(): Boolean = js.native
  def loadComplete(src: String): Boolean = js.native
  def play(src: String, interrupt: js.Any = ???, delay: Double = ???, offset: Double = ???, loop: Double = ???, volume: Double = ???, pan: Double = ???): AbstractSoundInstance = js.native
  def registerManifest(manifest: js.Array[Object], basePath: String): Object = js.native
  def registerPlugins(plugins: js.Array[js.Any]): Boolean = js.native
  def registerSound(src: String, id: String = ???, data: Double = ???, basePath: String = ???): Object = js.native
  def registerSounds(sounds: js.Array[Object], basePath: String = ???): js.Array[Object] = js.native
  def removeAllSounds(): Unit = js.native
  def removeManifest(manifest: js.Array[js.Any], basePath: String): Object = js.native
  def removeSound(src: String, basePath: String): Boolean = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Unit = js.native
  def stop(): Unit = js.native
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

@JSName("createjs.SoundJS")
class SoundJS extends js.Object {
}

@JSName("createjs.SoundJS")
object SoundJS extends js.Object {
  var buildDate: String = js.native
  var version: String = js.native
}

@JSName("createjs.WebAudioLoader")
class WebAudioLoader extends js.Object {
}

@JSName("createjs.WebAudioLoader")
object WebAudioLoader extends js.Object {
  var context: AudioContext = js.native
}

@JSName("createjs.WebAudioPlugin")
class WebAudioPlugin extends AbstractPlugin {
  var context: AudioContext = js.native
  var dynamicsCompressorNode: DynamicsCompressorNode = js.native
  var gainNode: GainNode = js.native
}

@JSName("createjs.WebAudioPlugin")
object WebAudioPlugin extends js.Object {
  var context: AudioContext = js.native
  def isSupported(): Boolean = js.native
  def playEmptySound(): Unit = js.native
}

@JSName("createjs.WebAudioSoundInstance")
class WebAudioSoundInstance protected () extends AbstractSoundInstance {
  def this(src: String, startTime: Double, duration: Double, playbackResource: Object) = this()
  var gainNode: GainNode = js.native
  var panNode: PannerNode = js.native
  var sourceNode: AudioNode = js.native
}

@JSName("createjs.WebAudioSoundInstance")
object WebAudioSoundInstance extends js.Object {
  var context: AudioContext = js.native
  var destinationNode: AudioNode = js.native
}
