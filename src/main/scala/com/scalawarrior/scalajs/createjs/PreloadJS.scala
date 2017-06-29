package com.scalawarrior.scalajs.createjs

import org.scalajs.dom.raw.HTMLAudioElement

import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("createjs.AbstractLoader")
class AbstractLoader extends EventDispatcher {
  var canceled: Boolean = js.native
  var GET: String = js.native
  var loaded: Boolean = js.native
  var POST: String = js.native
  var progress: Double = js.native
  var resultFormatter: js.Function0[Any] = js.native
  var `type`: String = js.native
  def cancel(): Unit = js.native
  def destroy(): Unit = js.native
  def getItem(value: String = ???): Object = js.native
  def getLoadedItems(): js.Array[Object] = js.native
  def getResult(value: js.Any = ???, rawResult: Boolean = ???): Object = js.native
  def getTag(): Object = js.native
  def load(): Unit = js.native
  def setTag(tag: Object): Unit = js.native
  override def toString(): String = js.native
}

@js.native
@JSGlobal("createjs.AbstractLoader")
object AbstractLoader extends js.Object {
  var BINARY: String = js.native
  var CSS: String = js.native
  var IMAGE: String = js.native
  var JAVASCRIPT: String = js.native
  var JSON: String = js.native
  var JSONP: String = js.native
  var MANIFEST: String = js.native
  var SOUND: String = js.native
  var SPRITESHEET: String = js.native
  var SVG: String = js.native
  var TEXT: String = js.native
  var VIDEO: String = js.native
  var XML: String = js.native
}

@js.native
@JSGlobal("createjs.AbstractMediaLoader")
class AbstractMediaLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean, `type`: String) = this()
}

@js.native
@JSGlobal("createjs.AbstractRequest")
class AbstractRequest protected () extends js.Object {
  def this(item: LoadItem) = this()
  def cancel(): Unit = js.native
  def destroy(): Unit = js.native
  def load(): Unit = js.native
}

@js.native
@JSGlobal("createjs.BinaryLoader")
class BinaryLoader protected () extends js.Object {
  def this(loadItem: Object) = this()
}

@js.native
@JSGlobal("createjs.BinaryLoader")
object BinaryLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.CSSLoader")
class CSSLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean) = this()
  def canLoadItem(item: Object): Boolean = js.native
}

//@JSGlobal("createjs.DataUtils")
//package object DataUtils extends js.Object {
//  def parseJSON(value: String): Object = js.native
//  def parseXML(text: String, `type`: String): XMLDocument = js.native
//}

@js.native
@JSGlobal("createjs.ErrorEvent")
class ErrorEvent protected () extends js.Object {
  def this(title: String = ???, message: String = ???, data: Object = ???) = this()
  var data: Object = js.native
  var message: String = js.native
  var title: String = js.native
}

@js.native
@JSGlobal("createjs.ImageLoader")
class ImageLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean) = this()
}

@js.native
@JSGlobal("createjs.ImageLoader")
object ImageLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.JavaScriptLoader")
class JavaScriptLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean) = this()
}

@js.native
@JSGlobal("createjs.JavaScriptLoader")
object JavaScriptLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.JSONLoader")
class JSONLoader protected () extends js.Object {
  def this(loadItem: Object) = this()
}

@js.native
@JSGlobal("createjs.JSONLoader")
object JSONLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.JSONPLoader")
class JSONPLoader protected () extends js.Object {
  def this(loadItem: Object) = this()
}

@js.native
@JSGlobal("createjs.JSONPLoader")
object JSONPLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.LoadItem")
class LoadItem extends js.Object {
  var callback: String = js.native
  var crossOrigin: Boolean = js.native
  var data: Object = js.native
  var headers: Object = js.native
  var id: String = js.native
  var loadTimeout: Double = js.native
  var maintainOrder: Boolean = js.native
  var method: String = js.native
  var mimeType: String = js.native
  var src: String = js.native
  var `type`: String = js.native
  var values: Object = js.native
  var withCredentials: Boolean = js.native
  def set(props: Object): LoadItem = js.native
}

@js.native
@JSGlobal("createjs.LoadItem")
object LoadItem extends js.Object {
  def create(value: Object): Object = js.native
}

@js.native
@JSGlobal("createjs.LoadQueue")
class LoadQueue protected () extends AbstractLoader {
  def this(preferXHR: Boolean = ???, basePath: String = ???, crossOrigin: String = ???) = this()
  var maintainScriptOrder: Boolean = js.native
  var next: LoadQueue = js.native
  var stopOnError: Boolean = js.native
  def close(): Unit = js.native
  def getItems(loaded: Boolean): js.Array[Object] = js.native
  def installPlugin(plugin: js.Function0[Any]): Unit = js.native
  def loadFile(file: Object, loadNow: Boolean = ???, basePath: String = ???): Unit = js.native
  def loadManifest(manifest: Object, loadNow: Boolean = ???, basePath: String = ???): Unit = js.native
  def registerLoader(loader: AbstractLoader): Unit = js.native
  def remove(idsOrUrls: String): Unit = js.native
  def removeAll(): Unit = js.native
  def reset(): Unit = js.native
  def setMaxConnections(value: Double): Unit = js.native
  def setPaused(value: Boolean): Unit = js.native
  def setPreferXHR(value: Boolean): Boolean = js.native
  def setUseXHR(value: Boolean): Unit = js.native
  def unregisterLoader(loader: AbstractLoader): Unit = js.native
}

@js.native
@JSGlobal("createjs.ManifestLoader")
class ManifestLoader protected () extends js.Object {
  def this(loadItem: LoadItem) = this()
}

@js.native
@JSGlobal("createjs.ManifestLoader")
object ManifestLoader extends js.Object {
  def canLoadItem(item: LoadItem): Boolean = js.native
}

@js.native
@JSGlobal("createjs.MediaTagRequest")
class MediaTagRequest protected () extends js.Object {
  def this(loadItem: LoadItem, tag: HTMLAudioElement, srcAttribute: String) = this()
}

@js.native
@JSGlobal("createjs.PreloadJS")
class PreloadJS extends js.Object {
}

@js.native
@JSGlobal("createjs.PreloadJS")
object PreloadJS extends js.Object {
  var buildDate: String = js.native
  var version: String = js.native
}

@js.native
@JSGlobal("createjs.ProgressEvent")
class ProgressEvent protected () extends js.Object {
  def this(loaded: Double, total: Double = ???) = this()
  var loaded: Double = js.native
  var progress: Double = js.native
  var total: Double = js.native
  override def clone(): ProgressEvent = js.native
}

@js.native
@JSGlobal("createjs.RequestUtils")
class RequestUtils extends js.Object {
}

@js.native
@JSGlobal("createjs.RequestUtils")
object RequestUtils extends js.Object {
  var ABSOLUTE_PATH: js.RegExp = js.native
  var EXTENSION_PATT: js.RegExp = js.native
  var RELATIVE_PATH: js.RegExp = js.native
  def buildPath(src: String, data: Object = ???): String = js.native
  def formatQueryString(data: Object, query: js.Array[Object] = ???): String = js.native
  def getTypeByExtension(extension: String): String = js.native
  def isAudioTag(item: Object): Boolean = js.native
  def isBinary(`type`: String): Boolean = js.native
  def isCrossDomain(item: Object): Boolean = js.native
  def isImageTag(item: Object): Boolean = js.native
  def isLocal(item: Object): Boolean = js.native
  def isText(`type`: String): Boolean = js.native
  def isVideoTag(item: Object): Boolean = js.native
  def parseURI(path: String): Object = js.native
}

@js.native
@JSGlobal("createjs.SoundLoader")
class SoundLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean) = this()
}

@js.native
@JSGlobal("createjs.SoundLoader")
object SoundLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.SpriteSheetLoader")
class SpriteSheetLoader protected () extends js.Object {
  def this(loadItem: Object) = this()
}

@js.native
@JSGlobal("createjs.SpriteSheetLoader")
object SpriteSheetLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.SVGLoader")
class SVGLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean) = this()
}

@js.native
@JSGlobal("createjs.SVGLoader")
object SVGLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.TagRequest")
class TagRequest extends js.Object {
}

@js.native
@JSGlobal("createjs.TextLoader")
class TextLoader protected () extends js.Object {
  def this(loadItem: Object) = this()
}

@js.native
@JSGlobal("createjs.TextLoader")
object TextLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.VideoLoader")
class VideoLoader protected () extends js.Object {
  def this(loadItem: Object, preferXHR: Boolean) = this()
}

@js.native
@JSGlobal("createjs.VideoLoader")
object VideoLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}

@js.native
@JSGlobal("createjs.XHRRequest")
class XHRRequest protected () extends AbstractLoader {
  def this(item: Object) = this()
  def getAllResponseHeaders(): String = js.native
  def getResponseHeader(header: String): String = js.native
}

@js.native
@JSGlobal("createjs.XMLLoader")
class XMLLoader protected () extends js.Object {
  def this(loadItem: Object) = this()
}

@js.native
@JSGlobal("createjs.XMLLoader")
object XMLLoader extends js.Object {
  def canLoadItem(item: Object): Boolean = js.native
}
