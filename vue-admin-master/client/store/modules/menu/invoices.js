import lazyLoading from './lazyLoading'

export default {
  name: 'Invoice',
  path: '/invoice',
  meta: {
    icon: 'fa-file-excel-o',
    expanded: false,
    link: 'invoice/index.vue'
  },
  component: lazyLoading('invoice', true)
}
