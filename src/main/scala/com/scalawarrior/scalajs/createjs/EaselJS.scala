package com.scalawarrior.scalajs.createjs

import org.scalajs.dom.raw._
import scala.scalajs.js
import scala.scalajs.js.annotation._

class NativeMouseEvent extends MouseEvent {
}

@JSName("createjs.AlphaMapFilter")
class AlphaMapFilter protected () extends Filter {
  def this(alphaMap: HTMLImageElement) = this()
  var alphaMap: HTMLImageElement = js.native
  override def clone(): AlphaMapFilter = js.native
}

@JSName("createjs.AlphaMaskFilter")
class AlphaMaskFilter protected () extends Filter {
  def this(mask: HTMLImageElement) = this()
  var mask: HTMLImageElement = js.native
  override def clone(): AlphaMaskFilter = js.native
}

@JSName("createjs.Bitmap")
class Bitmap protected () extends DisplayObject {
  def this(imageOrUrl: HTMLImageElement) = this()
  var image: HTMLImageElement = js.native
  var sourceRect: Rectangle = js.native
  override def clone(): Bitmap = js.native
}

@JSName("createjs.BitmapText")
class BitmapText protected () extends DisplayObject {
  def this(text: String = ???, spriteSheet: SpriteSheet = ???) = this()
  var letterSpacing: Double = js.native
  var lineHeight: Double = js.native
  var spaceWidth: Double = js.native
  var spriteSheet: SpriteSheet = js.native
  var text: String = js.native
}

@JSName("createjs.BitmapText")
object BitmapText extends js.Object {
  var maxPoolSize: Double = js.native
}

@JSName("createjs.BlurFilter")
class BlurFilter protected () extends Filter {
  def this(blurX: Double = ???, blurY: Double = ???, quality: Double = ???) = this()
  var blurX: Double = js.native
  var blurY: Double = js.native
  var quality: Double = js.native
  override def clone(): BlurFilter = js.native
}

@JSName("createjs.ButtonHelper")
class ButtonHelper protected () extends js.Object {
  def this(target: Sprite, outLabel: String = ???, overLabel: String = ???, downLabel: String = ???, play: Boolean = ???, hitArea: DisplayObject = ???, hitLabel: String = ???) = this()
  var downLabel: String = js.native
  var outLabel: String = js.native
  var overLabel: String = js.native
  var play: Boolean = js.native
  var target: Sprite = js.native
  var enabled: Boolean = js.native
  def setEnabled(value: Boolean): Unit = js.native
  def getEnabled(): Boolean = js.native
  override def toString(): String = js.native
}

@JSName("createjs.ColorFilter")
class ColorFilter protected () extends Filter {
  def this(redMultiplier: Double = ???, greenMultiplier: Double = ???, blueMultiplier: Double = ???, alphaMultiplier: Double = ???, redOffset: Double = ???, greenOffset: Double = ???, blueOffset: Double = ???, alphaOffset: Double = ???) = this()
  var alphaMultiplier: Double = js.native
  var alphaOffset: Double = js.native
  var blueMultiplier: Double = js.native
  var blueOffset: Double = js.native
  var greenMultiplier: Double = js.native
  var greenOffset: Double = js.native
  var redMultiplier: Double = js.native
  var redOffset: Double = js.native
  override def clone(): ColorFilter = js.native
}

@JSName("createjs.ColorMatrix")
class ColorMatrix protected () extends js.Object {
  def this(brightness: Double = ???, contrast: Double = ???, saturation: Double = ???, hue: Double = ???) = this()
  def adjustBrightness(value: Double): ColorMatrix = js.native
  def adjustColor(brightness: Double, contrast: Double, saturation: Double, hue: Double): ColorMatrix = js.native
  def adjustContrast(value: Double): ColorMatrix = js.native
  def adjustHue(value: Double): ColorMatrix = js.native
  def adjustSaturation(value: Double): ColorMatrix = js.native
  override def clone(): ColorMatrix = js.native
  def concat(matrix: Double*): ColorMatrix = js.native
  def copy(matrix: Double*): ColorMatrix = js.native
  def reset(): ColorMatrix = js.native
  def setColor(brightness: Double, contrast: Double, saturation: Double, hue: Double): ColorMatrix = js.native
  def toArray(): js.Array[Double] = js.native
  override def toString(): String = js.native
}

@JSName("createjs.ColorMatrixFilter")
class ColorMatrixFilter protected () extends Filter {
  def this(matrix: js.Array[Double]) = this()
  var matrix: js.Array[Double] = js.native
  override def clone(): ColorMatrixFilter = js.native
}

@JSName("createjs.Container")
class Container extends DisplayObject {
  var children: js.Array[DisplayObject] = js.native
  var mouseChildren: Boolean = js.native
  var numChildren: Double = js.native
  var tickChildren: Boolean = js.native
  def addChild(child: DisplayObject*): DisplayObject = js.native
  def addChildAt(child: DisplayObject, index: Double): DisplayObject = js.native
  def addChildAt(childOrIndex: js.Any*): DisplayObject = js.native
  def clone(recursive: Boolean = ???): Container = js.native
  def contains(child: DisplayObject): Boolean = js.native
  def getChildAt(index: Double): DisplayObject = js.native
  def getChildByName(name: String): DisplayObject = js.native
  def getChildIndex(child: DisplayObject): Double = js.native
  def getNumChildren(): Double = js.native
  def getObjectsUnderPoint(x: Double, y: Double, mode: Double): js.Array[DisplayObject] = js.native
  def getObjectUnderPoint(x: Double, y: Double, mode: Double): DisplayObject = js.native
  def removeAllChildren(): Unit = js.native
  def removeChild(child: DisplayObject*): Boolean = js.native
  def removeChildAt(index: Double*): Boolean = js.native
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  def sortChildren(sortFunction: js.Function2[DisplayObject, DisplayObject, Double]): Unit = js.native
  def swapChildren(child1: DisplayObject, child2: DisplayObject): Unit = js.native
  def swapChildrenAt(index1: Double, index2: Double): Unit = js.native
}

@JSName("createjs.DisplayObject")
class DisplayObject extends EventDispatcher {
  var alpha: Double = js.native
  var cacheCanvas: HTMLCanvasElement = js.native
  var cacheID: Double = js.native
  var compositeOperation: String = js.native
  var cursor: String = js.native
  var filters: js.Array[Filter] = js.native
  var hitArea: DisplayObject = js.native
  var id: Double = js.native
  var mask: Shape = js.native
  var mouseEnabled: Boolean = js.native
  var name: String = js.native
  var parent: Container = js.native
  var regX: Double = js.native
  var regY: Double = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var shadow: Shadow = js.native
  var skewX: Double = js.native
  var skewY: Double = js.native
  var snapToPixel: Boolean = js.native
  var stage: Stage = js.native
  var tickEnabled: Boolean = js.native
  var transformMatrix: Matrix2D = js.native
  var visible: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
  def cache(x: Double, y: Double, width: Double, height: Double, scale: Double = ???): Unit = js.native
  override def clone(): DisplayObject = js.native
  def draw(ctx: CanvasRenderingContext2D, ignoreCache: Boolean = ???): Boolean = js.native
  def getBounds(): Rectangle = js.native
  def getCacheDataURL(): String = js.native
  def getConcatenatedDisplayProps(props: DisplayProps = ???): DisplayProps = js.native
  def getConcatenatedMatrix(mtx: Matrix2D = ???): Matrix2D = js.native
  def getMatrix(matrix: Matrix2D = ???): Matrix2D = js.native
  def getStage(): Stage = js.native
  def getTransformedBounds(): Rectangle = js.native
  def globalToLocal(x: Double, y: Double, pt: Point = ???): Point = js.native
  def hitTest(x: Double, y: Double): Boolean = js.native
  def isVisible(): Boolean = js.native
  def localToGlobal(x: Double, y: Double, pt: Point = ???): Point = js.native
  def localToLocal(x: Double, y: Double, target: DisplayObject, pt: Point = ???): Point = js.native
  def set(props: Object): DisplayObject = js.native
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setTransform(x: Double = ???, y: Double = ???, scaleX: Double = ???, scaleY: Double = ???, rotation: Double = ???, skewX: Double = ???, skewY: Double = ???, regX: Double = ???, regY: Double = ???): DisplayObject = js.native
  def uncache(): Unit = js.native
  def updateCache(compositeOperation: String = ???): Unit = js.native
  def updateContext(ctx: CanvasRenderingContext2D): Unit = js.native
}

@JSName("createjs.DisplayObject")
object DisplayObject extends js.Object {
  var suppressCrossDomainErrors: Boolean = js.native
}

@JSName("createjs.DisplayProps")
class DisplayProps protected () extends js.Object {
  def this(visible: Double = ???, alpha: Double = ???, shadow: Double = ???, compositeOperation: Double = ???, matrix: Double = ???) = this()
  var alpha: Double = js.native
  var compositeOperation: String = js.native
  var matrix: Matrix2D = js.native
  var shadow: Shadow = js.native
  var visible: Boolean = js.native
  def append(visible: Boolean, alpha: Double, shadow: Shadow, compositeOperation: String, matrix: Matrix2D = ???): DisplayProps = js.native
  override def clone(): DisplayProps = js.native
  def identity(): DisplayProps = js.native
  def prepend(visible: Boolean, alpha: Double, shadow: Shadow, compositeOperation: String, matrix: Matrix2D = ???): DisplayProps = js.native
  def setValues(visible: Boolean = ???, alpha: Double = ???, shadow: Double = ???, compositeOperation: Double = ???, matrix: Double = ???): DisplayProps = js.native
}

@JSName("createjs.DOMElement")
class DOMElement protected () extends DisplayObject {
  def this(htmlElement: HTMLElement) = this()
  var htmlElement: HTMLElement = js.native
  override def clone(): DisplayObject = js.native
  override def set(props: Object): DOMElement = js.native
  override def setTransform(x: Double = ???, y: Double = ???, scaleX: Double = ???, scaleY: Double = ???, rotation: Double = ???, skewX: Double = ???, skewY: Double = ???, regX: Double = ???, regY: Double = ???): DOMElement = js.native
}

@JSName("createjs.EaselJS")
class EaselJS extends js.Object {
}

@JSName("createjs.EaselJS")
object EaselJS extends js.Object {
  var buildDate: String = js.native
  var version: String = js.native
}

@JSName("createjs.Filter")
class Filter extends js.Object {
  def applyFilter(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, targetCtx: CanvasRenderingContext2D = ???, targetX: Double = ???, targetY: Double = ???): Boolean = js.native
  override def clone(): Filter = js.native
  def getBounds(): Rectangle = js.native
  override def toString(): String = js.native
}

@JSName("createjs.Graphics")
class Graphics extends js.Object {
  var command: Object = js.native
  var instructions: js.Array[Object] = js.native
  def append(command: Object, clean: Boolean = ???): Graphics = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginBitmapFill(image: Object, repetition: String = ???, matrix: Matrix2D = ???): Graphics = js.native
  def beginBitmapStroke(image: Object, repetition: String = ???): Graphics = js.native
  def beginFill(color: String): Graphics = js.native
  def beginLinearGradientFill(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def beginLinearGradientStroke(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def beginRadialGradientFill(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Graphics = js.native
  def beginRadialGradientStroke(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Graphics = js.native
  def beginStroke(color: String): Graphics = js.native
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Graphics = js.native
  def clear(): Graphics = js.native
  override def clone(): Graphics = js.native
  def closePath(): Graphics = js.native
  def curveTo(cpx: Double, cpy: Double, x: Double, y: Double): Graphics = js.native
  def decodePath(str: String): Graphics = js.native
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawAsPath(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def drawPolyStar(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double): Graphics = js.native
  def drawRect(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def drawRoundRect(x: Double, y: Double, w: Double, h: Double, radius: Double): Graphics = js.native
  def drawRoundRectComplex(x: Double, y: Double, w: Double, h: Double, radiusTL: Double, radiusTR: Double, radiusBR: Double, radisBL: Double): Graphics = js.native
  def endFill(): Graphics = js.native
  def endStroke(): Graphics = js.native
  def getInstructions(): js.Array[Object] = js.native
  def inject(callback: js.Function1[js.Any, Any], data: js.Any): Graphics = js.native
  def isEmpty(): Boolean = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Graphics = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String = ???, joints: String = ???, miterLimit: Double = ???, ignoreScale: Boolean = ???): Graphics = js.native
  def store(): Graphics = js.native
  override def toString(): String = js.native
  def unstore(): Graphics = js.native
  def a(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def at(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def bf(image: Object, repetition: String = ???, matrix: Matrix2D = ???): Graphics = js.native
  def bs(image: Object, repetition: String = ???): Graphics = js.native
  def f(color: String): Graphics = js.native
  def lf(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def ls(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def rf(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Graphics = js.native
  def rs(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Graphics = js.native
  def s(color: String): Graphics = js.native
  def bt(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Graphics = js.native
  def c(): Graphics = js.native
  def cp(): Graphics = js.native
  def p(str: String): Graphics = js.native
  def dc(x: Double, y: Double, radius: Double): Graphics = js.native
  def de(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def dp(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double): Graphics = js.native
  def dr(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def rr(x: Double, y: Double, w: Double, h: Double, radius: Double): Graphics = js.native
  def rc(x: Double, y: Double, w: Double, h: Double, radiusTL: Double, radiusTR: Double, radiusBR: Double, radisBL: Double): Graphics = js.native
  def ef(): Graphics = js.native
  def es(): Graphics = js.native
  def lt(x: Double, y: Double): Graphics = js.native
  def mt(x: Double, y: Double): Graphics = js.native
  def qt(cpx: Double, cpy: Double, x: Double, y: Double): Graphics = js.native
  def r(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def ss(thickness: Double, caps: String = ???, joints: String = ???, miterLimit: Double = ???, ignoreScale: Boolean = ???): Graphics = js.native
}

@JSName("createjs.Graphics")
object Graphics extends js.Object {
  var BASE_64: Object = js.native
  //var beginCmd: Graphics.BeginPath = js.native
  var STROKE_CAPS_MAP: js.Array[String] = js.native
  var STROKE_JOINTS_MAP: js.Array[String] = js.native
  def getHSL(hue: Double, saturation: Double, lightness: Double, alpha: Double = ???): String = js.native
  def getRGB(r: Double, g: Double, b: Double, alpha: Double = ???): String = js.native
}

@JSName("createjs.Matrix2D")
class Matrix2D protected () extends js.Object {
  def this(a: Double = ???, b: Double = ???, c: Double = ???, d: Double = ???, tx: Double = ???, ty: Double = ???) = this()
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  def append(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix2D = js.native
  def appendMatrix(matrix: Matrix2D): Matrix2D = js.native
  def appendTransform(x: Double, y: Double, scaleX: Double, scaleY: Double, rotation: Double, skewX: Double, skewY: Double, regX: Double = ???, regY: Double = ???): Matrix2D = js.native
  override def clone(): Matrix2D = js.native
  def copy(matrix: Matrix2D): Matrix2D = js.native
  def decompose(): js.Any = js.native
  def decompose(target: Object): Matrix2D = js.native
  def equals(matrix: Matrix2D): Boolean = js.native
  def identity(): Matrix2D = js.native
  def invert(): Matrix2D = js.native
  def isIdentity(): Boolean = js.native
  def prepend(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix2D = js.native
  def prependMatrix(matrix: Matrix2D): Matrix2D = js.native
  def prependTransform(x: Double, y: Double, scaleX: Double, scaleY: Double, rotation: Double, skewX: Double, skewY: Double, regX: Double = ???, regY: Double = ???): Matrix2D = js.native
  def rotate(angle: Double): Matrix2D = js.native
  def scale(x: Double, y: Double): Matrix2D = js.native
  def setValues(a: Double = ???, b: Double = ???, c: Double = ???, d: Double = ???, tx: Double = ???, ty: Double = ???): Matrix2D = js.native
  def skew(skewX: Double, skewY: Double): Matrix2D = js.native
  override def toString(): String = js.native
  def transformPoint(x: Double, y: Double, pt: Point = ???): Point = js.native
  def translate(x: Double, y: Double): Matrix2D = js.native
}

@JSName("createjs.Matrix2D")
object Matrix2D extends js.Object {
  var DEG_TO_RAD: Double = js.native
  var identity: Matrix2D = js.native
}

@JSName("createjs.MouseEvent")
class MouseEvent protected () extends Event {
  def this(`type`: String, bubbles: Boolean, cancelable: Boolean, stageX: Double, stageY: Double, nativeEvent: NativeMouseEvent, pointerID: Double, primary: Boolean, rawX: Double, rawY: Double) = this()
  var isTouch: Boolean = js.native
  var localX: Double = js.native
  var localY: Double = js.native
  var nativeEvent: NativeMouseEvent = js.native
  var pointerID: Double = js.native
  var primary: Boolean = js.native
  var rawX: Double = js.native
  var rawY: Double = js.native
  var stageX: Double = js.native
  var stageY: Double = js.native
  override def clone(): MouseEvent = js.native
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

@JSName("createjs.MovieClip")
class MovieClip protected () extends Container {
  def this(mode: String = ???, startPosition: Double = ???, loop: Boolean = ???, labels: Object = ???) = this()
  var actionsEnabled: Boolean = js.native
  var autoReset: Boolean = js.native
  var currentFrame: Double = js.native
  var currentLabel: String = js.native
  var frameBounds: js.Array[Rectangle] = js.native
  var framerate: Double = js.native
  var labels: js.Array[Object] = js.native
  var loop: Boolean = js.native
  var mode: String = js.native
  var paused: Boolean = js.native
  var startPosition: Double = js.native
  var timeline: Timeline = js.native
  def advance(time: Double = ???): Unit = js.native
  override def clone(): MovieClip = js.native
  def getCurrentLabel(): String = js.native
  def getLabels(): js.Array[Object] = js.native
  def gotoAndPlay(positionOrLabel: String): Unit = js.native
  def gotoAndStop(positionOrLabel: String): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
}

@JSName("createjs.MovieClip")
object MovieClip extends js.Object {
  var buildDate: String = js.native
  var INDEPENDENT: String = js.native
  var SINGLE_FRAME: String = js.native
  var SYNCHED: String = js.native
  var version: String = js.native
}

@JSName("createjs.MovieClipPlugin")
class MovieClipPlugin extends js.Object {
  def tween(tween: Tween, prop: String, value: String, startValues: js.Array[js.Any], endValues: js.Array[js.Any], ratio: Double, wait: Object, end: Object): Unit = js.native
}

@JSName("createjs.Point")
class Point protected () extends js.Object {
  def this(x: Double = ???, y: Double = ???) = this()
  var x: Double = js.native
  var y: Double = js.native
  override def clone(): Point = js.native
  def copy(point: Point): Point = js.native
  def setValues(x: Double = ???, y: Double = ???): Point = js.native
  override def toString(): String = js.native
}

@JSName("createjs.Rectangle")
class Rectangle protected () extends js.Object {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()
  var height: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  override def clone(): Rectangle = js.native
  def contains(x: Double, y: Double, width: Double = ???, height: Double = ???): Boolean = js.native
  def copy(rectangle: Rectangle): Rectangle = js.native
  def extend(x: Double, y: Double, width: Double = ???, height: Double = ???): Rectangle = js.native
  def intersection(rect: Rectangle): Rectangle = js.native
  def intersects(rect: Rectangle): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def setValues(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???): Rectangle = js.native
  override def toString(): String = js.native
  def union(rect: Rectangle): Rectangle = js.native
}

@JSName("createjs.Shadow")
class Shadow protected () extends js.Object {
  def this(color: String, offsetX: Double, offsetY: Double, blur: Double) = this()
  var blur: Double = js.native
  var color: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  override def clone(): Shadow = js.native
  override def toString(): String = js.native
}

@JSName("createjs.Shadow")
object Shadow extends js.Object {
  var identity: Shadow = js.native
}

@JSName("createjs.Shape")
class Shape protected () extends DisplayObject {
  def this(graphics: Graphics = ???) = this()
  var graphics: Graphics = js.native
  def clone(recursive: Boolean = ???): Shape = js.native
  override def set(props: Object): Shape = js.native
  override def setTransform(x: Double = ???, y: Double = ???, scaleX: Double = ???, scaleY: Double = ???, rotation: Double = ???, skewX: Double = ???, skewY: Double = ???, regX: Double = ???, regY: Double = ???): Shape = js.native
}

@JSName("createjs.Sprite")
class Sprite protected () extends DisplayObject {
  def this(spriteSheet: SpriteSheet, frameOrAnimation: String = ???) = this()
  var currentAnimation: String = js.native
  var currentAnimationFrame: Double = js.native
  var currentFrame: Double = js.native
  var framerate: Double = js.native
  var offset: Double = js.native
  var paused: Boolean = js.native
  var spriteSheet: SpriteSheet = js.native
  def advance(time: Double = ???): Unit = js.native
  override def clone(): Sprite = js.native
  override def getBounds(): Rectangle = js.native
  def gotoAndPlay(frameOrAnimation: String): Unit = js.native
  def gotoAndStop(frameOrAnimation: String): Unit = js.native
  def play(): Unit = js.native
  override def set(props: Object): Sprite = js.native
  override def setTransform(x: Double = ???, y: Double = ???, scaleX: Double = ???, scaleY: Double = ???, rotation: Double = ???, skewX: Double = ???, skewY: Double = ???, regX: Double = ???, regY: Double = ???): Sprite = js.native
  def stop(): Unit = js.native
}

@JSName("createjs.SpriteContainer")
class SpriteContainer protected () extends Container {
  def this(spriteSheet: SpriteSheet = ???) = this()
  var spriteSheet: SpriteSheet = js.native
}

trait SpriteSheetAnimation extends js.Object {
  var frames: js.Array[Double] = js.native
  var speed: Double = js.native
  var name: String = js.native
  var next: String = js.native
}

trait SpriteSheetFrame extends js.Object {
  var image: HTMLImageElement = js.native
  var rect: Rectangle = js.native
}

@JSName("createjs.SpriteSheet")
class SpriteSheet protected () extends EventDispatcher {
  def this(data: Object) = this()
  var animations: js.Array[String] = js.native
  var complete: Boolean = js.native
  var framerate: Double = js.native
  override def clone(): SpriteSheet = js.native
  def getAnimation(name: String): SpriteSheetAnimation = js.native
  def getAnimations(): js.Array[String] = js.native
  def getFrame(frameIndex: Double): SpriteSheetFrame = js.native
  def getFrameBounds(frameIndex: Double, rectangle: Rectangle = ???): Rectangle = js.native
  def getNumFrames(animation: String): Double = js.native
}

@JSName("createjs.SpriteSheetBuilder")
class SpriteSheetBuilder extends EventDispatcher {
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var padding: Double = js.native
  var progress: Double = js.native
  var scale: Double = js.native
  var spriteSheet: SpriteSheet = js.native
  var timeSlice: Double = js.native
  def addAnimation(name: String, frames: js.Array[Double], next: String = ???, frequency: Double = ???): Unit = js.native
  def addFrame(source: DisplayObject, sourceRect: Rectangle = ???, scale: Double = ???, setupFunction: js.Function0[Any] = ???, setupData: Object = ???): Double = js.native
  def addMovieClip(source: MovieClip, sourceRect: Rectangle = ???, scale: Double = ???, setupFunction: js.Function0[Any] = ???, setupData: Object = ???, labelFunction: js.Function0[Any] = ???): Unit = js.native
  def build(): SpriteSheet = js.native
  def buildAsync(timeSlice: Double = ???): Unit = js.native
  //override def clone(): Unit = js.native
  def stopAsync(): Unit = js.native
}

@JSName("createjs.SpriteSheetUtils")
class SpriteSheetUtils extends js.Object {
}

@JSName("createjs.SpriteSheetUtils")
object SpriteSheetUtils extends js.Object {
  def addFlippedFrames(spriteSheet: SpriteSheet, horizontal: Boolean = ???, vertical: Boolean = ???, both: Boolean = ???): Unit = js.native
  def extractFrame(spriteSheet: SpriteSheet, frameOrAnimation: Double): HTMLImageElement = js.native
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement, canvas: HTMLCanvasElement = ???): HTMLCanvasElement = js.native
}

@JSName("createjs.SpriteStage")
class SpriteStage protected () extends Stage {
  def this(canvas: HTMLCanvasElement, preserveDrawingBuffer: Boolean = ???, antialias: Boolean = ???) = this()
  var isWebGL: Boolean = js.native
  def clearImageTexture(image: Object): Unit = js.native
  def updateViewport(width: Double, height: Double): Unit = js.native
}

@JSName("createjs.SpriteStage")
object SpriteStage extends js.Object {
  var INDICES_PER_BOX: Double = js.native
  var MAX_BOXES_POINTS_INCREMENT: Double = js.native
  var MAX_INDEX_SIZE: Double = js.native
  var NUM_VERTEX_PROPERTIES: Double = js.native
  var NUM_VERTEX_PROPERTIES_PER_BOX: Double = js.native
  var POINTS_PER_BOX: Double = js.native
}

@JSName("createjs.Stage")
class Stage protected () extends Container {
  def this(canvas: String) = this()
  var autoClear: Boolean = js.native
  var canvas: HTMLCanvasElement = js.native
  var drawRect: Rectangle = js.native
  var handleEvent: js.Function = js.native
  var mouseInBounds: Boolean = js.native
  var mouseMoveOutside: Boolean = js.native
  var mouseX: Double = js.native
  var mouseY: Double = js.native
  var nextStage: Stage = js.native
  var preventSelection: Boolean = js.native
  var snapToPixelEnabled: Boolean = js.native
  var tickOnUpdate: Boolean = js.native
  def clear(): Unit = js.native
  override def clone(): Stage = js.native
  def enableDOMEvents(enable: Boolean = ???): Unit = js.native
  def enableMouseOver(frequency: Double = ???): Unit = js.native
  def tick(props: Object = ???): Unit = js.native
  def toDataURL(backgroundColor: String, mimeType: String): String = js.native
  def update(arg: js.Any*): Unit = js.native
}

@JSName("createjs.Text")
class Text protected () extends DisplayObject {
  def this(text: String = ???, font: String = ???, color: String = ???) = this()
  var color: String = js.native
  var font: String = js.native
  var lineHeight: Double = js.native
  var lineWidth: Double = js.native
  var maxWidth: Double = js.native
  var outline: Double = js.native
  var text: String = js.native
  var textAlign: String = js.native
  var textBaseline: String = js.native
  override def clone(): Text = js.native
  def getMeasuredHeight(): Double = js.native
  def getMeasuredLineHeight(): Double = js.native
  def getMeasuredWidth(): Double = js.native
  def getMetrics(): Object = js.native
  override def set(props: Object): Text = js.native
  override def setTransform(x: Double = ???, y: Double = ???, scaleX: Double = ???, scaleY: Double = ???, rotation: Double = ???, skewX: Double = ???, skewY: Double = ???, regX: Double = ???, regY: Double = ???): Text = js.native
}

@JSName("createjs.Ticker")
class Ticker extends js.Object {
}

@JSName("createjs.Ticker")
object Ticker extends js.Object {
  var framerate: Double = js.native
  var interval: Double = js.native
  var maxDelta: Double = js.native
  var paused: Double = js.native
  var RAF: String = js.native
  var RAF_SYNCHED: String = js.native
  var TIMEOUT: String = js.native
  var timingMode: String = js.native
  var useRAF: Boolean = js.native
  def getEventTime(runTime: Boolean = ???): Double = js.native
  def getFPS(): Double = js.native
  def getInterval(): Double = js.native
  def getMeasuredFPS(ticks: Double = ???): Double = js.native
  def getMeasuredTickTime(ticks: Double = ???): Double = js.native
  def getPaused(): Boolean = js.native
  def getTicks(pauseable: Boolean = ???): Double = js.native
  def getTime(runTime: Boolean = ???): Double = js.native
  def init(): Unit = js.native
  def reset(): Unit = js.native
  def setFPS(value: Double): Unit = js.native
  def setInterval(interval: Double): Unit = js.native
  def setPaused(value: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: Stage, useCapture: Boolean = ???): Stage = js.native
  //def addEventListener(`type`: String, listener: js.Function1[Object, Boolean], useCapture: Boolean = ???): js.Function = js.native
  //def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean = ???): Object = js.native
  def dispatchEvent(eventObj: Object, target: Object = ???): Boolean = js.native
  def hasEventListener(`type`: String): Boolean = js.native
  def off(`type`: String, listener: js.Function1[Object, Boolean], useCapture: Boolean = ???): Unit = js.native
  //def on(`type`: String, listener: js.Function1[Object, Boolean], scope: Object = ???, once: Boolean = ???, data: js.Any = ???, useCapture: Boolean = ???): js.Function = js.native
  //def on(`type`: String, listener: js.Any, scope: Object = ???, once: Boolean = ???, data: js.Any = ???, useCapture: Boolean = ???): Object = js.native
  def removeAllEventListeners(`type`: String = ???): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[Object, Boolean], useCapture: Boolean = ???): Unit = js.native
  override def toString(): String = js.native
  def willTrigger(`type`: String): Boolean = js.native
}

@JSName("createjs.TickerEvent")
class TickerEvent extends js.Object {
  var target: Object = js.native
  var `type`: String = js.native
  var paused: Boolean = js.native
  var delta: Double = js.native
  var time: Double = js.native
  var runTime: Double = js.native
}

@JSName("createjs.Touch")
class Touch extends js.Object {
}

@JSName("createjs.Touch")
object Touch extends js.Object {
  def disable(stage: Stage): Unit = js.native
  def enable(stage: Stage, singleTouch: Boolean = ???, allowDefault: Boolean = ???): Boolean = js.native
  def isSupported(): Boolean = js.native
}

@JSName("createjs.UID")
class UID extends js.Object {
}

@JSName("createjs.UID")
object UID extends js.Object {
  def get(): Double = js.native
}

@JSName("createjs.Graphics.Arc")
class Arc protected () extends js.Object {
  def this(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double) = this()
  var anticlockwise: Double = js.native
  var endAngle: Double = js.native
  var radius: Double = js.native
  var startAngle: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@JSName("createjs.Graphics.ArcTo")
class ArcTo protected () extends js.Object {
  def this(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double) = this()
  var x1: Double = js.native
  var y1: Double = js.native
  var x2: Double = js.native
  var y2: Double = js.native
  var radius: Double = js.native
}

@JSName("createjs.Graphics.BeginPath")
class BeginPath extends js.Object {
}

@JSName("createjs.Graphics.BezierCurveTo")
class BezierCurveTo protected () extends js.Object {
  def this(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double) = this()
  var cp1x: Double = js.native
  var cp1y: Double = js.native
  var cp2x: Double = js.native
  var cp2y: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@JSName("createjs.Graphics.Circle")
class Circle protected () extends js.Object {
  def this(x: Double, y: Double, radius: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var radius: Double = js.native
}

@JSName("createjs.Graphics.ClosePath")
class ClosePath extends js.Object {
}

@JSName("createjs.Graphics.Fill")
class Fill protected () extends js.Object {
  def this(style: Object, matrix: Matrix2D = ???) = this()
  var style: Object = js.native
  var matrix: Matrix2D = js.native
  def bitmap(image: HTMLImageElement, repetition: String = ???): Fill = js.native
  def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Fill = js.native
  def radialGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Fill = js.native
}

@JSName("createjs.Graphics.LineTo")
class LineTo protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
}

@JSName("createjs.Graphics.MoveTo")
class MoveTo protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
}

@JSName("createjs.Graphics.PolyStar")
class PolyStar protected () extends js.Object {
  def this(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double) = this()
  var angle: Double = js.native
  var pointSize: Double = js.native
  var radius: Double = js.native
  var sides: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@JSName("createjs.Graphics.QuadraticCurveTo")
class QuadraticCurveTo protected () extends js.Object {
  def this(cpx: Double, cpy: Double, x: Double, y: Double) = this()
  var cpx: Double = js.native
  var cpy: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@JSName("createjs.Graphics.Rect")
class Rect protected () extends js.Object {
  def this(x: Double, y: Double, w: Double, h: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var w: Double = js.native
  var h: Double = js.native
}

@JSName("createjs.Graphics.RoundRect")
class RoundRect protected () extends js.Object {
  def this(x: Double, y: Double, w: Double, h: Double, radiusTL: Double, radiusTR: Double, radiusBR: Double, radiusBL: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var w: Double = js.native
  var h: Double = js.native
  var radiusTL: Double = js.native
  var radiusTR: Double = js.native
  var radiusBR: Double = js.native
  var radiusBL: Double = js.native
}

@JSName("createjs.Graphics.Stroke")
class Stroke protected () extends js.Object {
  def this(style: Object, ignoreScale: Boolean) = this()
  var style: Object = js.native
  var ignoreScale: Boolean = js.native
  def bitmap(image: HTMLImageElement, repetition: String = ???): Stroke = js.native
  def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Stroke = js.native
  def radialGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Stroke = js.native
}

@JSName("createjs.Graphics.StrokeStyle")
class StrokeStyle protected () extends js.Object {
  def this(width: Double, caps: String, joints: Double, miterLimit: Double) = this()
  var caps: String = js.native
  var joints: String = js.native
  var miterLimit: Double = js.native
  var width: Double = js.native
}
