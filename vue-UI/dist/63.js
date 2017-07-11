webpackJsonp([63],{

/***/ 133:
/***/ (function(module, exports, __webpack_require__) {


/* styles */
__webpack_require__(876)

var Component = __webpack_require__(2)(
  /* script */
  __webpack_require__(432),
  /* template */
  __webpack_require__(781),
  /* scopeId */
  null,
  /* cssModules */
  null
)
Component.options.__file = "C:\\Users\\sofri\\Desktop\\test\\clear 2.8.3\\vue\\src\\components\\pricing.vue"
if (Component.esModule && Object.keys(Component.esModule).some(function (key) {return key !== "default" && key !== "__esModule"})) {console.error("named exports are not supported in *.vue files.")}
if (Component.options.functional) {console.error("[vue-loader] pricing.vue: functional components are not supported with templates, they should use render functions.")}

/* hot reload */
if (false) {(function () {
  var hotAPI = require("vue-hot-reload-api")
  hotAPI.install(require("vue"), false)
  if (!hotAPI.compatible) return
  module.hot.accept()
  if (!module.hot.data) {
    hotAPI.createRecord("data-v-2a34320f", Component.options)
  } else {
    hotAPI.reload("data-v-2a34320f", Component.options)
  }
})()}

module.exports = Component.exports


/***/ }),

/***/ 432:
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
    mounted: function mounted() {
        $(".span-btn").on("click", function () {
            if ($(this).hasClass("yearly")) {
                $(".monthly-pack").hide(500);
                $(".yearly-pack").show(500);
            } else {
                $(".monthly-pack").show(500);
                $(".yearly-pack").hide(500);
            }
        });
    }
});
/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(0)))

/***/ }),

/***/ 532:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)();
exports.push([module.i, "/*pricing table 1*/\n.span-btn, .span-btn:hover {\n    color: #666;\n    background-color: #DCDCDC;\n    border-color: #DCDCDC;\n}\n.span-btn.active, .span-btn.active:hover {\n    color: #fff;\n    background-color: #376ea4;\n    border-color: #2d5986;\n}\n/*table styles*/\n.modal-1 {\n    border         : 1px solid #B6D1CC;\n    border-radius  : 3px;\n    margin-top     : 20px;\n    margin-bottom  : 10px;\n    padding-bottom : 25px;\n}\n.modal-1 .pack-heading {\n    background-color : #E1EFEF;\n    padding          : 2px 0;\n    height           : 145px;\n}\n.pack-heading p {\n    color  : #555;\n    margin : 13px 0;\n}\n.modal-1 .pack-title {\n    font-size : 22px;\n    color     : #677777;\n}\n.modal-1 .pack-price {\n    font-size : 36px;\n    position  : relative;\n}\n.modal-1 .pack-price span {\n    font-size : 18px;\n    color     : #777;\n}\n.modal-1 .pack-price .dollar {\n    font-size : 22px;\n    color     : #777;\n    top       : -20px;\n    display   : inline;\n}\n.modal-1 .section-head {\n    font-size   : 15px;\n    font-weight : bold;\n    color       : #60B6A3;\n    margin      : 40px 0 15px;\n}\n.modal-1 .pack-details li {\n    line-height : 38px;\n    color       : #555;\n    font-size   : 14px;\n}\n.modal-1 .pack-details li.text-dummy {\n    color : #999;\n}\n.modal-1 .btn-getit {\n    border-radius         : 3px;\n    padding               : 5px 17px;\n    margin-top            : 30px;\n}\n.modal-1 .trending-tag {\n    height   : 79px;\n    overflow : hidden;\n    position : absolute;\n    left     : 15px;\n    top      : 20px;\n    width    : 80px;\n}\n.tag-design {\n    font              : bold 12px Noto Sans;\n    background-color  : #3AAE97;\n    padding-top       : 22px;\n    position          : relative;\n    text-align        : center;\n    top               : -12px;\n    left              : -40px;\n    -webkit-transform : rotate(-45deg);\n    transform         : rotate(-45deg);\n    width             : 116px;\n    height            : 61px;\n}\n.pro-option {\n    font-size   : 24px;\n    line-height : 24px;\n    margin      : 25px 0;\n}\n.contact-info {\n    font-size     : 14px;\n    margin-bottom : 20px;\n}\n.btn-contact {\n    color         : #4080bf;\n    border        : 1px solid #4080bf;\n    padding       : 6px 25px;\n    border-radius : 20px;\n}\n.btn-contact:hover {\n    background-color : #4080bf;\n    color            : #fff;\n}\n@media screen and (max-width : 767px) {\n.modal-1 .trending-tag {\n        top : 0;\n}\n}\n", ""]);

/***/ }),

/***/ 781:
/***/ (function(module, exports, __webpack_require__) {

module.exports={render:function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _vm._m(0)
},staticRenderFns: [function (){var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;
  return _c('div', [_c('div', {
    staticClass: "row text-center"
  }, [_c('div', {
    staticClass: "col-sm-12 col-lg-12"
  }, [_c('div', {
    staticClass: "btn-group",
    attrs: {
      "data-toggle": "buttons"
    }
  }, [_c('label', {
    staticClass: "btn btn-default span-btn monthly active"
  }, [_c('input', {
    attrs: {
      "type": "radio",
      "name": "options",
      "id": "option2",
      "autocomplete": "off",
      "checked": ""
    }
  }), _vm._v(" Monthly Tariff\n                ")]), _vm._v(" "), _c('label', {
    staticClass: "btn btn-default span-btn yearly"
  }, [_c('input', {
    attrs: {
      "type": "radio",
      "name": "options",
      "id": "option3",
      "autocomplete": "off"
    }
  }), _vm._v(" Yearly Tariff\n                ")])])]), _vm._v(" "), _c('div', {
    staticClass: "col-sm-6 col-lg-3"
  }, [_c('div', {
    staticClass: "modal-1"
  }, [_c('div', {
    staticClass: "pack-heading"
  }, [_c('h4', {
    staticClass: "pack-title"
  }, [_c('strong', [_vm._v("Basic")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price monthly-pack"
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("49"), _c('span', [_vm._v("/mo")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price yearly-pack",
    attrs: {
      "hidden": ""
    }
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("540"), _c('span', [_vm._v("/yr")])]), _vm._v(" "), _c('p', [_vm._v("$45/mo If you get yearly Pack.")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("TRACKED CAMPAIGNS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("5")]), _vm._v(" Campaigns")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("300")]), _vm._v(" Keyword Ranking")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("250,000")]), _vm._v(" Crawled Pages")]), _vm._v(" "), _c('li', {
    staticClass: "text-dummy"
  }, [_vm._v("No Branded Reports")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("KEYWORD EXPLORER")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("5 Keywords Reports")])]), _vm._v(" "), _c('li', {
    staticClass: "text-dummy"
  }, [_vm._v("No Keywords List")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("USER ACCESS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("2")]), _vm._v(" Seats")])]), _vm._v(" "), _c('button', {
    staticClass: "btn btn-primary center-block btn-getit"
  }, [_vm._v("Get it now")])])]), _vm._v(" "), _c('div', {
    staticClass: "col-sm-6 col-lg-3"
  }, [_c('div', {
    staticClass: "modal-1"
  }, [_c('div', {
    staticClass: "trending-tag"
  }, [_c('div', {
    staticClass: "tag-design bg-primary"
  }, [_vm._v("Best\n                        "), _c('br'), _vm._v(" Package")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-heading"
  }, [_c('h4', {
    staticClass: "pack-title"
  }, [_c('strong', [_vm._v("Econamic")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price monthly-pack"
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("99"), _c('span', [_vm._v("/mo")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price yearly-pack",
    attrs: {
      "hidden": ""
    }
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("1104"), _c('span', [_vm._v("/yr")])]), _vm._v(" "), _c('p', [_vm._v("$92/mo If you get yearly Pack.")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("TRACKED CAMPAIGNS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("10")]), _vm._v(" Campaigns")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("750")]), _vm._v(" Keyword Ranking")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("500,000")]), _vm._v(" Crawled Pages")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("Branded Reports")])])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("KEYWORD EXPLORER")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("5,000")]), _vm._v(" Full Keywords Reports")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("30")]), _vm._v(" Full Keywords List")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("USER ACCESS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("10")]), _vm._v(" Seats")])]), _vm._v(" "), _c('button', {
    staticClass: "btn btn-danger center-block btn-getit"
  }, [_vm._v("Get it now")])])]), _vm._v(" "), _c('div', {
    staticClass: "col-sm-6 col-lg-3"
  }, [_c('div', {
    staticClass: "modal-1"
  }, [_c('div', {
    staticClass: "pack-heading"
  }, [_c('h4', {
    staticClass: "pack-title"
  }, [_c('strong', [_vm._v("Premium")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price monthly-pack"
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("159"), _c('span', [_vm._v("/mo")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price yearly-pack",
    attrs: {
      "hidden": ""
    }
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("1788"), _c('span', [_vm._v("/yr")])]), _vm._v(" "), _c('p', [_vm._v("$149/mo If you get yearly Pack.")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("TRACKED CAMPAIGNS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("25")]), _vm._v(" Campaigns")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("1,700")]), _vm._v(" Keyword Ranking")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("1,125,000")]), _vm._v(" Crawled Pages")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("Branded Reports")])])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("KEYWORD EXPLORER")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("12,000")]), _vm._v(" Full Keywords Reports")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("50")]), _vm._v(" Full Keywords List")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("USER ACCESS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("25")]), _vm._v(" Seats")])]), _vm._v(" "), _c('button', {
    staticClass: "btn btn-primary center-block btn-getit"
  }, [_vm._v("Get it now")])])]), _vm._v(" "), _c('div', {
    staticClass: "col-sm-6 col-lg-3"
  }, [_c('div', {
    staticClass: "modal-1"
  }, [_c('div', {
    staticClass: "pack-heading"
  }, [_c('h4', {
    staticClass: "pack-title"
  }, [_c('strong', [_vm._v("Enterprise")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price monthly-pack"
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("399"), _c('span', [_vm._v("/mo")])]), _vm._v(" "), _c('div', {
    staticClass: "pack-price yearly-pack",
    attrs: {
      "hidden": ""
    }
  }, [_c('sup', {
    staticClass: "dollar"
  }, [_vm._v("$")]), _vm._v("4620"), _c('span', [_vm._v("/yr")])]), _vm._v(" "), _c('p', [_vm._v("$385/mo If you get yearly Pack.")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("TRACKED CAMPAIGNS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("100")]), _vm._v(" Campaigns")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("7,500")]), _vm._v(" Keyword Ranking")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("1,250,000")]), _vm._v(" Crawled Pages")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("Branded Reports")])])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("KEYWORD EXPLORER")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("30,000")]), _vm._v(" Full Keywords Reports")]), _vm._v(" "), _c('li', [_c('strong', [_vm._v("90")]), _vm._v(" Full Keywords List")])]), _vm._v(" "), _c('p', {
    staticClass: "section-head"
  }, [_vm._v("USER ACCESS")]), _vm._v(" "), _c('ul', {
    staticClass: "pack-details list-unstyled"
  }, [_c('li', [_c('strong', [_vm._v("30")]), _vm._v(" Seats")])]), _vm._v(" "), _c('button', {
    staticClass: "btn btn-primary center-block btn-getit"
  }, [_vm._v("Get it now")])])]), _vm._v(" "), _c('div', {
    staticClass: "col-sm-12 col-lg-12"
  }, [_c('p', {
    staticClass: "pro-option"
  }, [_vm._v("Want to be a PRO User?")]), _vm._v(" "), _c('p', {
    staticClass: "contact-info"
  }, [_vm._v("We have larger and the best plans designed for you.")]), _vm._v(" "), _c('a', {
    staticClass: "btn btn-contact",
    attrs: {
      "href": "javascript:void(0)"
    }
  }, [_vm._v("Contact Us")])])])])
}]}
module.exports.render._withStripped = true
if (false) {
  module.hot.accept()
  if (module.hot.data) {
     require("vue-hot-reload-api").rerender("data-v-2a34320f", module.exports)
  }
}

/***/ }),

/***/ 876:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(532);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(3)("6cc0608f", content, false);
// Hot Module Replacement
if(false) {
 // When the styles change, update the <style> tags
 if(!content.locals) {
   module.hot.accept("!!../../../../node_modules/css-loader/index.js!../../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-2a34320f\",\"scoped\":false,\"hasInlineConfig\":true}!./pricing_table.css", function() {
     var newContent = require("!!../../../../node_modules/css-loader/index.js!../../../../node_modules/vue-loader/lib/style-compiler/index.js?{\"id\":\"data-v-2a34320f\",\"scoped\":false,\"hasInlineConfig\":true}!./pricing_table.css");
     if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
     update(newContent);
   });
 }
 // When the module is disposed, remove the <style> tags
 module.hot.dispose(function() { update(); });
}

/***/ })

});