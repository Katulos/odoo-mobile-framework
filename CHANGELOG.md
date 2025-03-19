# Changelog

## [0.1.0](https://github.com/Katulos/odoo-mobile-framework/compare/v0.0.1...v0.1.0) (2025-03-19)

### New Feature(s) 🚀

* Added all change ([e3f5258](https://github.com/Katulos/odoo-mobile-framework/commit/e3f525839cccee65ab079c3ad92b29f1a229757c))

### Legacy Changelog
- November 2016
    - odoo-rpc-v3 source merged with Framework
    - Added Odoo 10.0 support
    - Minor bug fixes
    - Runtime model registry (No need to register each models in BaseModel class)
      Note: With Instant Run registry will not work in Debug mode, but it will work fine in Released mode
      *Disable Instant Run https://goo.gl/lsfhq9*

- June 2016
    - Sync performance improved
    - Easy relation record creation (Fix for: [https://github.com/Odoo-mobile/framework/issues/138](138))
        - ManyToOne, OneToMany and ManyToMany
    - Minor bug fixes
