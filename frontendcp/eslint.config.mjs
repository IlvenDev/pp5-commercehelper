import angularEslint from '@angular-eslint/eslint-plugin';
import angularEslintTemplate from '@angular-eslint/eslint-plugin-template';
import typescriptParser from '@typescript-eslint/parser';
import prettierPlugin from 'eslint-plugin-prettier';

export default [
  {
    files: ['src/**/*.ts'],
    languageOptions: {
      parser: typescriptParser,
      parserOptions: {
        project: './tsconfig.json',
      },
    },
    plugins: {
      '@angular-eslint': angularEslint,
      prettier: prettierPlugin,
    },
    rules: {
      ...angularEslint.configs.recommended.rules,
      'prettier/prettier': 'error',
    },
  },
  {
    files: ['*.html'],
    plugins: {
      '@angular-eslint/template': angularEslintTemplate,
    },
    rules: {
      ...angularEslintTemplate.configs.recommended.rules,
    },
  },
];
