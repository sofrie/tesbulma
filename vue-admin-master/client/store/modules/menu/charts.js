import lazyLoading from './lazyLoading'

export default {
  name: 'AWB',
  path: '/charts',
  meta: {
    icon: 'fa-file',
    expanded: false,
    link: 'charts/index.vue'
  },
  component: lazyLoading('charts', true)
}
