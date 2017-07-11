webpackJsonp([55],{

/***/ 388:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function($) {Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

/* harmony default export */ __webpack_exports__["default"] = ({
    name: "boxed_movableheader",
    mounted: function mounted() {
        $("html").addClass("stylehtml");
        $("body").addClass("boxed movable-header");
        $("header").addClass("header_movable");
        $(".navbar-fixed-top").removeClass("navbar-fixed-top").addClass("navbar-static-top");
    },
    destroyed: function destroyed() {
        $("html").removeClass("stylehtml");
        $("body").removeClass("boxed movable-header");
        $("header").removeClass("header_movable");
        $(".navbar-static-top").removeClass("navbar-static-top").addClass("navbar-fixed-top");
        $("#temp_style").remove();
        location.reload();
    }
});
/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(0)))

/***/ }),

/***/ 651:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "\nbody.movable-header {\n  overflow: hidden;\n}\nbody.movable-header #app .header {\n    position: relative !important;\n}\nbody.movable-header .right-side {\n    padding-top: 0;\n}\n@media screen and (max-width: 992px) {\nbody.movable-header #menu {\n      padding-top: 0;\n}\n}\n", ""]);

/***/ }),

/***/ 652:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "\n.right-side[data-v-cb4b2122] {\n    padding-top :0;\n}\n.movable-header .rightsidebar-without-nav[data-v-cb4b2122] {\n    padding-top : 20px !important\n}\n@media screen and (max-width : 560px) {\nbody[data-v-cb4b2122] {\n        padding-top : 0 !important;\n}\n    /*fixednav pages*/\n.fixednav_right[data-v-cb4b2122] {\n        padding-top : 112px;\n}\n}\n@media screen and (max-width : 992px) {\n.fixed-menu #menu[data-v-cb4b2122] {\n        padding-top : 0;\n}\n.movable-header #right[data-v-cb4b2122] {\n        padding-top : 0;\n}\n}\n@media screen and (max-width : 560px) {\n.fixed-menu #menu[data-v-cb4b2122] {\n        padding-top : 90px;\n}\n.movable-header .rightsidebar-without-nav-small[data-v-cb4b2122] {\n        padding-top : 70px !important\n}\n}\n.movable-header #menu[data-v-cb4b2122] {\n    padding-top : 0;\n}\n/*==== layout fixed ====*/\n.slimScrollBar[data-v-cb4b2122] {\n    width      : 3px !important;\n    opacity    : 0.5 !important;\n    background : rgb(130, 194, 224) !important;\n}\n.menu_align[data-v-cb4b2122] {\n    margin-bottom : 50px;\n}\n.full_img[data-v-cb4b2122] {\n    width: 100%;\n    height: 150px;\n    border-radius: 5px;\n}\n/*movable header page*/\n.header_movable[data-v-cb4b2122] {\n    position : relative !important;\n}\n\n/*====End of layout fixed ====*/\n", ""]);

/***/ }),

/***/ 836:
/***/ (function(module, exports, __webpack_require__) {

module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _vm._m(0)
},staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', [_c('div', {
    staticClass: "outer"
  }, [_c('div', {
    staticClass: "inner bg-light lter"
  }, [_c('h2', [_vm._v("Code")]), _vm._v(" "), _c('pre', [_c('code', {
    staticClass: "language-markup"
  }, [_vm._v("<body class=\"boxed\">\n    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n    ...\n    </nav>\n</body>")])])])]), _vm._v(" "), _c('div', {
    staticClass: "col-lg-12"
  }, [_c('p', {
    staticClass: "text-justify"
  }, [_vm._v("\n                    Sed sed blandit urna. Proin ac sem nisl. Mauris risus orci, tristique eget velit at, congue euismod lacus. Curabitur id purus sit amet urna rutrum bibendum ac at quam. In hendrerit enim eu turpis molestie, et euismod tellus viverra. Suspendisse molestie at leo sit amet volutpat. Integer augue libero, scelerisque vitae luctus ac, consequat et arcu.\n            ")]), _vm._v(" "), _c('p', [_vm._v("\n                    Nullam malesuada turpis eu ullamcorper tincidunt. Integer aliquam felis eget neque facilisis ornare. Integer pharetra vitae dolor vel elementum. In nisl risus, dignissim non fermentum ac, pretium sit amet dui. Phasellus fringilla orci sapien, vel lacinia mi dapibus ut. Donec euismod congue nulla, in porttitor sapien. Pellentesque acilisis luctus adipiscing.\n            ")]), _vm._v(" "), _c('p', {
    staticClass: "text-justify"
  }, [_c('img', {
    staticClass: "img-responsive full_img",
    attrs: {
      "src": __webpack_require__(16),
      "alt": "holder image"
    }
  })]), _vm._v(" "), _c('p', [_vm._v("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam massa eros, dictum ut imperdiet eget, laoreet placerat orci. Aliquam eget neque neque. Donec dictum, enim convallis gravida fringilla, velit sem condimentum nunc, in pretium libero est sit amet elit. Nam ut arcu ac eros commodo rutrum ac nec purus. Fusce sodales pulvinar odio, vulputate fringilla ligula bibendum sit amet. Duis risus neque, molestie tincidunt odio vel, sodales vulputate mauris.\n            ")]), _vm._v(" "), _c('p', [_vm._v("\n                    Sed adipiscing justo tristique enim pharetra, nec ultricies metus sagittis.Duis varius id massa ut pellentesque. Nulla commodo erat eu mi aliquet aliquam. Vivamus commodo massa et nunc ullamcorper, vel pharetra purus consequat. Suspendisse a neque quis nibh dictum posuere ac et enim. Aliquam sit amet accumsan erat. Nullam euismod elit tellus, vel luctus enim luctus feugiat. Vestibulum quis placerat ipsum, porta vehicula massa. Etiam nec risus ac lacus gravida tincidunt. Vivamus eu ante vehicula, aliquam nisl et, suscipit ipsum. Vivamus velit nulla, tincidunt ac risus et, congue lobortis mauris. In condimentum consectetur purus, vel adipiscing felis sollicitudin vitae. Phasellus luctus, ligula eu tempor ullamcorper, lectus elit posuere augue, eget tempus lacus nibh a purus.\n            ")]), _vm._v(" "), _c('p', [_vm._v("\n                   Ut risus velit, adipiscing eu leo quis, vestibulum porttitor nunc. Sed sed blandit urna. Proin ac sem nisl. Mauris risus orci, tristique eget velit at, congue euismod lacus. Curabitur id purus sit amet urna rutrum bibendum ac at quam. In hendrerit enim eu turpis molestie, et euismod tellus viverra. Suspendisse molestie at leo sit amet volutpat. Integer augue libero, scelerisque vitae luctus ac, consequat et arcu. Nullam malesuada turpis eu ullamcorper tincidunt. Integer aliquam felis eget neque facilisis ornare. Integer pharetra vitae dolor vel elementum. In nisl risus, dignissim non fermentum ac, pretium sit amet dui. Phasellus fringilla orci sapien, vel lacinia mi dapibus ut. Donec euismod congue nulla, in porttitor sapien. Pellentesque facilisis luctus adipiscing.\n            ")]), _vm._v(" "), _c('div', {
    staticClass: "clearfix"
  }), _vm._v(" "), _c('p', {
    staticClass: "text-justify"
  }, [_c('img', {
    staticClass: "img-responsive full_img",
    attrs: {
      "src": __webpack_require__(16),
      "alt": "holder image"
    }
  })]), _vm._v(" "), _c('p', [_vm._v("\n                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam massa eros, dictum ut imperdiet eget, laoreet placerat orci. Aliquam eget neque neque. Donec dictum, enim convallis gravida fringilla, velit sem condimentum nunc, in pretium libero est sit amet elit. Nam ut arcu ac eros commodo rutrum ac nec purus. Fusce sodales pulvinar odio, vulputate fringilla ligula bibendum sit amet. Duis risus neque, molestie tincidunt odio vel, sodales vulputate mauris. Sed adipiscing justo tristique enim pharetra, nec ultricies metus sagittis. Duis varius id massa ut pellentesque.\n            ")]), _vm._v(" "), _c('p', [_vm._v("    Nulla commodo erat eu mi aliquet aliquam. Vivamus commodo massa et nunc ullamcorper, vel pharetra purus consequat. Suspendisse a neque quis nibh dictum posuere ac et enim. Aliquam sit amet accumsan erat. Nullam euismod elit tellus, vel luctus enim luctus feugiat. Vestibulum quis placerat ipsum, porta vehicula massa. Etiam nec risus ac lacus gravida tincidunt. Vivamus eu ante vehicula, aliquam nisl et, suscipit ipsum. Vivamus velit nulla, tincidunt ac risus et, congue lobortis mauris. In condimentum consectetur purus, vel adipiscing felis sollicitudin vitae. Phasellus luctus, ligula eu tempor ullamcorper, lectus elit posuere augue, eget tempus lacus nibh a purus.\n            ")]), _vm._v(" "), _c('p', [_vm._v("    Ut risus velit, adipiscing eu leo quis, vestibulum porttitor nunc. Sed sed blandit urna. Proin ac sem nisl. Mauris risus orci, tristique eget velit at, congue euismod lacus. Curabitur id purus sit amet urna rutrum bibendum ac at quam. In hendrerit enim eu turpis molestie, et euismod tellus viverra. Suspendisse molestie at leo sit amet volutpat. Integer augue libero, scelerisque vitae luctus ac, consequat et arcu. Nullam malesuada turpis eu ullamcorper tincidunt. Integer aliquam felis eget neque facilisis ornare. Integer pharetra vitae dolor vel elementum. In nisl risus, dignissim non fermentum ac, pretium sit amet dui. Phasellus fringilla orci sapien, vel lacinia mi dapibus ut. Donec euismod congue nulla, in porttitor sapien. Pellentesque facilisis luctus adipiscing.\n            ")]), _vm._v(" "), _c('div', {
    staticClass: "clearfix"
  })])])
}]}
module.exports.render._withStripped = true
if (false) {
  module.hot.accept()
  if (module.hot.data) {
     require("vue-hot-reload-api").rerender("data-v-cb4b2122", module.exports)
  }
}

/***/ }),

/***/ 90:
/***/ (function(module, exports, __webpack_require__) {


/* styles */
__webpack_require__(996)
__webpack_require__(995)

var Component = __webpack_require__(2)(
  /* script */
  __webpack_require__(388),
  /* template */
  __webpack_require__(836),
  /* scopeId */
  "data-v-cb4b2122",
  /* cssModules */
  null
)
Component.options.__file = "C:\\Users\\sofri\\Desktop\\test\\clear 2.8.3\\vue\\src\\components\\boxed_movableheader.vue"
if (Component.esModule && Object.keys(Component.esModule).some(function (key) {return key !== "default" && key !== "__esModule"})) {console.error("named exports are not supported in *.vue files.")}
if (Component.options.functional) {console.error("[vue-loader] boxed_movableheader.vue: functional components are not supported with templates, they should use render functions.")}

/* hot reload */
if (false) {(function () {
  var hotAPI = require("vue-hot-reload-api")
  hotAPI.install(require("vue"), false)
  if (!hotAPI.compatible) return
  module.hot.accept()
  if (!module.hot.data) {
    hotAPI.createRecord("data-v-cb4b2122", Component.options)
  } else {
    hotAPI.reload("data-v-cb4b2122", Component.options)
  }
})()}

module.exports = Component.exports


/***/ }),

/***/ 995:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(651);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("09385964", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../node_modules/css-loader/index.js!../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-cb4b2122\",\"scoped\":false,\"hasInlineConfig\":true}!../../node_modules/sass-loader/lib/loader.js!../../node_modules/vue-loader/lib/selector.js?type=styles&index=1!./boxed_movableheader.vue", function() {
     var newContent = require("!!../../node_modules/css-loader/index.js!../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-cb4b2122\",\"scoped\":false,\"hasInlineConfig\":true}!../../node_modules/sass-loader/lib/loader.js!../../node_modules/vue-loader/lib/selector.js?type=styles&index=1!./boxed_movableheader.vue");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ }),

/***/ 996:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(652);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("d9854e86", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../../node_modules/css-loader/index.js!../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-cb4b2122\",\"scoped\":true,\"hasInlineConfig\":true}!./layouts.css", function() {
     var newContent = require("!!../../../node_modules/css-loader/index.js!../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-cb4b2122\",\"scoped\":true,\"hasInlineConfig\":true}!./layouts.css");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ })

});