import lazyLoading from './lazyLoading'

export default {
  name: 'AWB',
  path: '/charts',
  meta: {
    icon: 'fa-bar-chart-o',
    expanded: false,
    link: 'charts/index.vue'
  },
  component: lazyLoading('charts', true)
}
