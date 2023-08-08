// src/main/frontend/src/setProxy.js

const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(app) {
  app.use(
    '/api',
    createProxyMiddleware({
      //target: 'http://localhost:8090',	# 서버 URL or localhost:설정한포트번호
      target: 'http://localhost:3000',	# 서버 URL or localhost:설정한포트번호
      changeOrigin: true,
    })
  );
};