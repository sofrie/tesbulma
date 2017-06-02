import lazyLoading from './lazyLoading'

export default {
  name: 'Invoice',
  path: '/invoice',
  meta: {
    icon: 'fa-bar-chart-o',
    expanded: false,
    link: 'invoice/index.vue'
  },
  component: lazyLoading('invoice', true)
}
