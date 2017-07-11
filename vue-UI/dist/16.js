webpackJsonp([16],{

/***/ 120:
/***/ (function(module, exports, __webpack_require__) {


/* styles */
__webpack_require__(967)
__webpack_require__(966)

var Component = __webpack_require__(2)(
  /* script */
  __webpack_require__(418),
  /* template */
  __webpack_require__(821),
  /* scopeId */
  null,
  /* cssModules */
  null
)
Component.options.__file = "C:\\Users\\sofri\\Desktop\\test\\clear 2.8.3\\vue\\src\\components\\image_magnifier.vue"
if (Component.esModule && Object.keys(Component.esModule).some(function (key) {return key !== "default" && key !== "__esModule"})) {console.error("named exports are not supported in *.vue files.")}
if (Component.options.functional) {console.error("[vue-loader] image_magnifier.vue: functional components are not supported with templates, they should use render functions.")}

/* hot reload */
if (false) {(function () {
  var hotAPI = require("vue-hot-reload-api")
  hotAPI.install(require("vue"), false)
  if (!hotAPI.compatible) return
  module.hot.accept()
  if (!module.hot.data) {
    hotAPI.createRecord("data-v-7ceabd63", Component.options)
  } else {
    hotAPI.reload("data-v-7ceabd63", Component.options)
  }
})()}

module.exports = Component.exports


/***/ }),

/***/ 299:
/***/ (function(module, exports) {

module.exports = "/images/29.jpg?b8ef35aeb9e40060939cc93b21b043af";

/***/ }),

/***/ 300:
/***/ (function(module, exports) {

module.exports = "/images/30.jpg?ee3fd5735ced45314181ea491e81d75a";

/***/ }),

/***/ 301:
/***/ (function(module, exports) {

module.exports = "/images/8.jpg?8b2085e1034de9619a00b014bf95f6dd";

/***/ }),

/***/ 312:
/***/ (function(module, exports) {

module.exports = "/images/20.jpg?118a3255d6fe32e68f97386a0c9c82d1";

/***/ }),

/***/ 313:
/***/ (function(module, exports) {

module.exports = "/images/31.jpg?65bb7ceed73cb8b3b9074a6d75ac61cd";

/***/ }),

/***/ 341:
/***/ (function(module, exports) {

module.exports = "/images/17.jpg?16215dd249033713ee9fa967e28c89bb";

/***/ }),

/***/ 342:
/***/ (function(module, exports) {

module.exports = "/images/24.jpg?49e2bf65e7fee4ac0a5a9122c5e63813";

/***/ }),

/***/ 343:
/***/ (function(module, exports) {

module.exports = "/images/32.jpg?68dd2c8bd16d495cc000dc7ade1c0a5f";

/***/ }),

/***/ 418:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function($) {Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__vendors_bootstrap_magnify_js_bootstrap_magnify_min_js__ = __webpack_require__(468);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__vendors_bootstrap_magnify_js_bootstrap_magnify_min_js___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_0__vendors_bootstrap_magnify_js_bootstrap_magnify_min_js__);
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
    name: "image_magnifier",
    mounted: function mounted() {
        $('[data-toggle="magnify"]').magnify();
    },
    destroyed: function destroyed() {}
});
/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(0)))

/***/ }),

/***/ 468:
/***/ (function(module, exports, __webpack_require__) {

/* WEBPACK VAR INJECTION */(function(__webpack_provided_window_dot_jQuery) {var _typeof = typeof Symbol === "function" && typeof Symbol.iterator === "symbol" ? function (obj) { return typeof obj; } : function (obj) { return obj && typeof Symbol === "function" && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj; };

!function (e) {
  "use strict";
  var t = function t(e, _t) {
    this.init("magnify", e, _t);
  };t.prototype = { constructor: t, init: function init(t, n, r) {
      var i = "mousemove",
          s = "mouseleave";this.type = t;this.$element = e(n);this.options = this.getOptions(r);this.nativeWidth = 0;this.nativeHeight = 0;this.$element.wrap('<div class="magnify" >');this.$element.parent(".magnify").append('<div class="magnify-large" >');this.$element.siblings(".magnify-large").css("background", "url('" + this.$element.attr("src") + "') no-repeat");this.$element.parent(".magnify").on(i + "." + this.type, e.proxy(this.check, this));this.$element.parent(".magnify").on(s + "." + this.type, e.proxy(this.check, this));
    }, getOptions: function getOptions(t) {
      t = e.extend({}, e.fn[this.type].defaults, t, this.$element.data());t.delay && typeof t.delay == "number" && (t.delay = { show: t.delay, hide: t.delay });return t;
    }, check: function check(t) {
      var n = e(t.currentTarget),
          r = n.children("img"),
          i = n.children(".magnify-large");if (!this.nativeWidth && !this.nativeHeight) {
        var s = new Image();s.src = r.attr("src");this.nativeWidth = s.width;this.nativeHeight = s.height;
      } else {
        var o = n.offset(),
            u = t.pageX - o.left,
            a = t.pageY - o.top;u < n.width() && a < n.height() && u > 0 && a > 0 ? i.fadeIn(100) : i.fadeOut(100);if (i.is(":visible")) {
          var f = Math.round(u / n.width() * this.nativeWidth - i.width() / 2) * -1,
              l = Math.round(a / n.height() * this.nativeHeight - i.height() / 2) * -1,
              c = f + "px " + l + "px",
              h = u - i.width() / 2,
              p = a - i.height() / 2;i.css({ left: h, top: p, backgroundPosition: c });
        }
      }
    } };e.fn.magnify = function (n) {
    return this.each(function () {
      var r = e(this),
          i = r.data("magnify"),
          s = (typeof n === "undefined" ? "undefined" : _typeof(n)) == "object" && n;i || r.data("tooltip", i = new t(this, s));typeof n == "string" && i[n]();
    });
  };e.fn.magnify.Constructor = t;e.fn.magnify.defaults = { delay: 0 };e(window).on("load", function () {
    e('[data-toggle="magnify"]').each(function () {
      var t = e(this);t.magnify();
    });
  });
}(__webpack_provided_window_dot_jQuery);
/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(0)))

/***/ }),

/***/ 622:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n/*image overlapping in magification*/\n.magnify .magnify {\n    z-index: 2;\n}\n.magnify .magnify-large {\n    z-index: 4;\n}\n", ""]);

/***/ }),

/***/ 623:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "\n.magnify{position:relative;cursor:none\n}\n.magnify-large{position:absolute;display:none;width:175px;height:175px;box-shadow:0 0 0 7px rgba(255,255,255,0.85),0 0 7px 7px rgba(0,0,0,0.25),inset 0 0 40px 2px rgba(0,0,0,0.25);border-radius:50%\n}\n", ""]);

/***/ }),

/***/ 821:
/***/ (function(module, exports, __webpack_require__) {

module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _vm._m(0)
},staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', [_c('div', {
    staticClass: "row"
  }, [_c('div', {
    staticClass: "col-lg-12"
  }, [_c('div', {
    staticClass: "panel",
    staticStyle: {
      "padding-bottom": "70px"
    }
  }, [_c('div', {
    staticClass: "panel-heading"
  }, [_c('h3', {
    staticClass: "panel-title"
  }, [_c('i', {
    staticClass: "livicon",
    attrs: {
      "data-name": "zoom-in",
      "data-c": "#fff",
      "data-hc": "#fff",
      "data-size": "18",
      "data-loop": "true"
    }
  }), _vm._v("\n                            Image Magnifier\n                        ")])]), _vm._v(" "), _c('div', {
    staticClass: "panel-body"
  }, [_c('div', {
    staticClass: "row"
  }, [_c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(342),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(300),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(312),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(299),
      "alt": "image"
    }
  })])])]), _vm._v(" "), _c('div', {
    staticClass: "row",
    staticStyle: {
      "margin-top": "40px"
    }
  }, [_c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(299),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(301),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(313),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(312),
      "alt": "image"
    }
  })])])]), _vm._v(" "), _c('div', {
    staticClass: "row",
    staticStyle: {
      "margin-top": "40px"
    }
  }, [_c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(300),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(343),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(341),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(301),
      "alt": "image"
    }
  })])])]), _vm._v(" "), _c('div', {
    staticClass: "row",
    staticStyle: {
      "margin-top": "40px"
    }
  }, [_c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(313),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(301),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(300),
      "alt": "image"
    }
  })])]), _vm._v(" "), _c('div', {
    staticClass: "col-md-3 col-xs-6"
  }, [_c('a', {
    staticClass: "mag img-responsive"
  }, [_c('br'), _vm._v(" "), _c('img', {
    staticClass: "mag-style img-responsive",
    attrs: {
      "data-toggle": "magnify",
      "src": __webpack_require__(299),
      "alt": "image"
    }
  })])])])])])])])])
}]}
module.exports.render._withStripped = true
if (false) {
  module.hot.accept()
  if (module.hot.data) {
     require("vue-hot-reload-api").rerender("data-v-7ceabd63", module.exports)
  }
}

/***/ }),

/***/ 966:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(622);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("636432c6", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../node_modules/css-loader/index.js!../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-7ceabd63\",\"scoped\":false,\"hasInlineConfig\":true}!../../node_modules/vue-loader/lib/selector.js?type=styles&index=1!./image_magnifier.vue", function() {
     var newContent = require("!!../../node_modules/css-loader/index.js!../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-7ceabd63\",\"scoped\":false,\"hasInlineConfig\":true}!../../node_modules/vue-loader/lib/selector.js?type=styles&index=1!./image_magnifier.vue");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ }),

/***/ 967:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(623);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("75e2c760", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../../../node_modules/css-loader/index.js!../../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-7ceabd63\",\"scoped\":false,\"hasInlineConfig\":true}!./bootstrap-magnify.min.css", function() {
     var newContent = require("!!../../../../node_modules/css-loader/index.js!../../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-7ceabd63\",\"scoped\":false,\"hasInlineConfig\":true}!./bootstrap-magnify.min.css");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ })

});