import * as types from '../../mutation-types'
import lazyLoading from './lazyLoading'
import uifeatures from './uifeatures'
import awb from './awb'
import components from './components'
import tables from './tables'
import invoices from './invoices'

// show: meta.label -> name
// name: component name
// meta.label: display label

const state = {
  items: [
    {
      name: 'Dashboard',
      path: '/dashboard',
      meta: {
        icon: 'fa-table',
        link: 'dashboard/index.vue'
      },
      component: lazyLoading('dashboard', true)
    },
    invoices,
    awb,
    {
      name: 'Logistic',
      path: '/logistic',
      meta: {
        icon: 'fa-table',
        link: 'logistic/index.vue'
      },
      component: lazyLoading('logistic', true)
    },
    {
      name: 'Setting',
      path: '/setting',
      meta: {
        icon: 'fa-table',
        link: 'setting/index.vue'
      },
      component: lazyLoading('setting', true)
    },
    uifeatures,
    components,
    tables
  ]
}

const mutations = {
  [types.EXPAND_MENU] (state, menuItem) {
    if (menuItem.index > -1) {
      if (state.items[menuItem.index] && state.items[menuItem.index].meta) {
        state.items[menuItem.index].meta.expanded = menuItem.expanded
      }
    } else if (menuItem.item && 'expanded' in menuItem.item.meta) {
      menuItem.item.meta.expanded = menuItem.expanded
    }
  }
}

export default {
  state,
  mutations
}
