webpackJsonp([69],{

/***/ 100:
/***/ (function(module, exports, __webpack_require__) {


/* styles */
__webpack_require__(979)

var Component = __webpack_require__(2)(
  /* script */
  __webpack_require__(398),
  /* template */
  __webpack_require__(826),
  /* scopeId */
  "data-v-8839742a",
  /* cssModules */
  null
)
Component.options.__file = "C:\\Users\\sofri\\Desktop\\test\\clear 2.8.3\\vue\\src\\components\\deleted_users.vue"
if (Component.esModule && Object.keys(Component.esModule).some(function (key) {return key !== "default" && key !== "__esModule"})) {console.error("named exports are not supported in *.vue files.")}
if (Component.options.functional) {console.error("[vue-loader] deleted_users.vue: functional components are not supported with templates, they should use render functions.")}

/* hot reload */
if (false) {(function () {
  var hotAPI = require("vue-hot-reload-api")
  hotAPI.install(require("vue"), false)
  if (!hotAPI.compatible) return
  module.hot.accept()
  if (!module.hot.data) {
    hotAPI.createRecord("data-v-8839742a", Component.options)
  } else {
    hotAPI.reload("data-v-8839742a", Component.options)
  }
})()}

module.exports = Component.exports


/***/ }),

/***/ 398:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
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
    name: "deleted_users",
    mounted: function mounted() {},
    destroyed: function destroyed() {}
});

/***/ }),

/***/ 635:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "\na i.ti-user[data-v-8839742a] {\n    color: #6699cc;\n}\n", ""]);

/***/ }),

/***/ 826:
/***/ (function(module, exports, __webpack_require__) {

module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _vm._m(0)
},staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', [_c('div', {
    staticClass: "row"
  }, [_c('div', {
    staticClass: "col-md-12"
  }, [_c('div', {
    staticClass: "panel"
  }, [_c('div', {
    staticClass: "panel-heading"
  }, [_c('h4', {
    staticClass: "panel-title"
  }, [_c('i', {
    staticClass: "ti-user",
    attrs: {
      "data-size": "18",
      "data-c": "#ffffff",
      "data-hc": "#ffffff"
    }
  }), _vm._v(" Deleted Users List\n                        ")])]), _vm._v(" "), _c('div', {
    staticClass: "panel-body"
  }, [_c('div', {
    staticClass: "table-responsive"
  }, [_c('table', {
    staticClass: "table table-bordered",
    attrs: {
      "id": "table"
    }
  }, [_c('thead', [_c('tr', {
    staticClass: "filters"
  }, [_c('th', [_vm._v("First Name")]), _vm._v(" "), _c('th', [_vm._v("Last Name")]), _vm._v(" "), _c('th', [_vm._v("User E-mail")]), _vm._v(" "), _c('th', [_vm._v("Created At")]), _vm._v(" "), _c('th', [_vm._v("Actions")])])]), _vm._v(" "), _c('tbody', [_c('tr', [_c('td', [_vm._v("Adele")]), _vm._v(" "), _c('td', [_vm._v("Becker")]), _vm._v(" "), _c('td', [_vm._v("otis98@hotmail.com")]), _vm._v(" "), _c('td', [_vm._v("2 weeks ago")]), _vm._v(" "), _c('td', [_c('a', {
    attrs: {
      "href": "#/users_list"
    }
  }, [_c('i', {
    staticClass: "fa ti-user",
    attrs: {
      "data-c": "#6699cc",
      "data-hc": "#6699cc",
      "data-size": "18",
      "title": "Restore"
    }
  })])])]), _vm._v(" "), _c('tr', [_c('td', [_vm._v("Adan")]), _vm._v(" "), _c('td', [_vm._v("Schmeler")]), _vm._v(" "), _c('td', [_vm._v("arnoldo19@gmail.com")]), _vm._v(" "), _c('td', [_vm._v("2 weeks ago")]), _vm._v(" "), _c('td', [_c('a', {
    attrs: {
      "href": "#/users_list"
    }
  }, [_c('i', {
    staticClass: "fa ti-user",
    attrs: {
      "data-c": "#6699cc",
      "data-hc": "#6699cc",
      "data-size": "18",
      "title": "Restore"
    }
  })])])]), _vm._v(" "), _c('tr', [_c('td', [_vm._v("Abbey")]), _vm._v(" "), _c('td', [_vm._v("Conn")]), _vm._v(" "), _c('td', [_vm._v("lehner.rhianna@christiansenwill.info")]), _vm._v(" "), _c('td', [_vm._v("2 weeks ago")]), _vm._v(" "), _c('td', [_c('a', {
    attrs: {
      "href": "#/users_list"
    }
  }, [_c('i', {
    staticClass: "fa ti-user",
    attrs: {
      "data-c": "#6699cc",
      "data-hc": "#6699cc",
      "data-size": "18",
      "title": "Restore"
    }
  })])])])])])])])])])])])
}]}
module.exports.render._withStripped = true
if (false) {
  module.hot.accept()
  if (module.hot.data) {
     require("vue-hot-reload-api").rerender("data-v-8839742a", module.exports)
  }
}

/***/ }),

/***/ 979:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(635);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("d736f48e", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../node_modules/css-loader/index.js!../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-8839742a\",\"scoped\":true,\"hasInlineConfig\":true}!../../node_modules/vue-loader/lib/selector.js?type=styles&index=0!./deleted_users.vue", function() {
     var newContent = require("!!../../node_modules/css-loader/index.js!../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-8839742a\",\"scoped\":true,\"hasInlineConfig\":true}!../../node_modules/vue-loader/lib/selector.js?type=styles&index=0!./deleted_users.vue");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ })

});