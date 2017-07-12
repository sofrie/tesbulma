webpackJsonp([62],{

/***/ 379:
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

/* harmony default export */ __webpack_exports__["default"] = ({
    name: "err404",
    mounted: function mounted() {
        $(window).on('load', function () {
            $('.preloader img').fadeOut();
            $('.preloader').fadeOut();
            $("html,body").css("height", "auto");
        });
    },
    destroyed: function destroyed() {}
});
/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(0)))

/***/ }),

/***/ 558:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "@import url(https://fonts.googleapis.com/css?family=Open+Sans:400,600);", ""]);
exports.push([module.i, "/*404 and 500 pages css*/\n\nbody {\n    font-family: 'Open Sans', sans-serif;\n}\n\n\n/*404*/\n.error_img img {\n    width: 100%;\n}\n.error_img {\n    margin-top: 10%;\n}\n\n\n/*500*/\n.bg-500 {\n    background-color: #C79D6F;\n}\n.error_msg img {\n    width: 100%;\n}\n@media screen and (max-width: 470px) {\n.error_msg img {\n        margin-top: 7%;\n}\n}\n.seperator {\n    border: 0;\n    height: 1px;\n    margin: 20px 0;\n    background-image: linear-gradient(to right, rgba(0, 0, 0, 0), rgba(0, 0, 0, .6), rgba(0, 0, 0, 0));\n}\n.link-home {\n    border-radius: 30px;\n}\n\n\n/* ===== Preloader =====*/\n.preloader {\n    position: fixed;\n    width: 100%;\n    height: 100%;\n    top: 0;\n    left: 0;\n    z-index: 100000;\n    -webkit-backface-visibility: hidden;\n            backface-visibility: hidden;\n    background: #ffffff;\n}\n.loader_img {\n    width: 50px;\n    height: 50px;\n    position: absolute;\n    left: 50%;\n    top: 50%;\n    background-position: center;\n    margin: -25px 0 0 -25px;\n}\n", ""]);

/***/ }),

/***/ 718:
/***/ (function(module, exports) {

module.exports = "/images/404.gif?62518dc1baaf8959c992559807c35ac3";

/***/ }),

/***/ 793:
/***/ (function(module, exports, __webpack_require__) {

module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _vm._m(0)
},staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', {
    staticClass: "container"
  }, [_c('div', {
    staticClass: "row"
  }, [_c('div', {
    staticClass: "col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 col-xs-10 col-xs-offset-1"
  }, [_c('div', {
    staticClass: "text-center"
  }, [_c('div', [_c('div', {
    staticClass: "error_img"
  }, [_c('img', {
    attrs: {
      "src": __webpack_require__(718),
      "alt": "404 error image"
    }
  })]), _vm._v(" "), _c('hr', {
    staticClass: "seperator"
  }), _vm._v(" "), _c('a', {
    staticClass: "btn btn-primary link-home",
    attrs: {
      "href": "/"
    }
  }, [_vm._v("Go Home")])])])])])])
}]}
module.exports.render._withStripped = true
if (false) {
  module.hot.accept()
  if (module.hot.data) {
     require("vue-hot-reload-api").rerender("data-v-4bb559fe", module.exports)
  }
}

/***/ }),

/***/ 81:
/***/ (function(module, exports, __webpack_require__) {


/* styles */
__webpack_require__(902)

var Component = __webpack_require__(2)(
  /* script */
  __webpack_require__(379),
  /* template */
  __webpack_require__(793),
  /* scopeId */
  null,
  /* cssModules */
  null
)
Component.options.__file = "C:\\Users\\sofri\\Desktop\\test\\clear 2.8.3\\vue\\src\\components\\404.vue"
if (Component.esModule && Object.keys(Component.esModule).some(function (key) {return key !== "default" && key !== "__esModule"})) {console.error("named exports are not supported in *.vue files.")}
if (Component.options.functional) {console.error("[vue-loader] 404.vue: functional components are not supported with templates, they should use render functions.")}

/* hot reload */
if (false) {(function () {
  var hotAPI = require("vue-hot-reload-api")
  hotAPI.install(require("vue"), false)
  if (!hotAPI.compatible) return
  module.hot.accept()
  if (!module.hot.data) {
    hotAPI.createRecord("data-v-4bb559fe", Component.options)
  } else {
    hotAPI.reload("data-v-4bb559fe", Component.options)
  }
})()}

module.exports = Component.exports


/***/ }),

/***/ 902:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(558);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("b4a231aa", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../../node_modules/css-loader/index.js!../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-4bb559fe\",\"scoped\":false,\"hasInlineConfig\":true}!./404.css", function() {
     var newContent = require("!!../../../node_modules/css-loader/index.js!../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-4bb559fe\",\"scoped\":false,\"hasInlineConfig\":true}!./404.css");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ })

});